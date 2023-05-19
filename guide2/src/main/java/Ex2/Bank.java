package Ex2;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<BankAccount> accounts;

    public Bank(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addBankAccount(BankAccount account){
        accounts.add(account);
    }

    public void transfer(float amount, String fromAccountCBU, String toAccountCBU){
        BankAccount fromAccount = searchForAccount(fromAccountCBU);
        BankAccount toAccount = searchForAccount(toAccountCBU);

        toAccount.deposit(fromAccount.withdraw(amount));
    }

    private BankAccount searchForAccount(String accountCBU) {
        for (BankAccount account: accounts) {
            if (account.getCbu().matches(accountCBU)) return account;
        }
        throw new RuntimeException("Account not found!");
    }
}
