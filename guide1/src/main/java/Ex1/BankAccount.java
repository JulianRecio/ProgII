package Ex1;

public class BankAccount {

    private String cbu;
    private float balance;

    public BankAccount(String cbu) {
        try {
            validateCBU(cbu);
            this.cbu = cbu;
            this.balance = 0;
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public BankAccount(String cbu, float balance) {
        try {
            validateCBU(cbu);
            this.cbu = cbu;
            this.balance = balance;
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    private void validateCBU(String cbu) throws RuntimeException{
        String regex = "^\\d{22}$";
        if (!cbu.matches(regex)) {
            throw new RuntimeException("CBU not valid");
        }
    }

    public void deposit(float amount){
        balance = balance + amount;
    }

    public float withdraw(float amount){
        balance = balance - amount;
        return amount;
    }

    public String getCbu() {
        return cbu;
    }

    public float getBalance() {
        return balance;
    }
}
