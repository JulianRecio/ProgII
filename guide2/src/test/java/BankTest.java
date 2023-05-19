import Ex2.Bank;
import Ex2.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTest {

    @Test
    public void testAddNSearchForBankAccount(){
        Bank bank = new Bank();

        BankAccount testAccount1 = new BankAccount("0110599540000099960043", 125000);
        BankAccount testAccount2 = new BankAccount("0170123220000000793858", 500000);
        BankAccount testAccount3 = new BankAccount("0340000710000096762049");

        bank.addBankAccount(testAccount1);
        bank.addBankAccount(testAccount2);
        bank.addBankAccount(testAccount3);

        bank.transfer(30000, "0110599540000099960043", "0340000710000096762049");

        Assertions.assertEquals(95000,testAccount1.getBalance());
        Assertions.assertEquals(30000,testAccount3.getBalance());
    }

}
