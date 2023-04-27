import Ex1.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testCreateBankAccount(){
        BankAccount testAccount1 = new BankAccount("1234567890123456789012");
        BankAccount testAccount2 = new BankAccount("2345678901212345678901", 25000);

        Assertions.assertEquals("1234567890123456789012", testAccount1.getCbu());
        Assertions.assertEquals(0,testAccount1.getBalance());
        Assertions.assertEquals("2345678901212345678901", testAccount2.getCbu());
        Assertions.assertEquals(25000,testAccount2.getBalance());
    }

    @Test
    public void testCBUValidation(){
        BankAccount testAccount1 = new BankAccount("invalid cbu!");
        //running this test prints out message error
    }

    @Test
    public void testDepositAndWithdraw(){
        BankAccount testAccount1 = new BankAccount("1234567890123456789012");
        BankAccount testAccount2 = new BankAccount("2345678901212345678901", 25000);

        testAccount2.withdraw(25000);
        testAccount1.deposit(25000);
        Assertions.assertEquals(25000,testAccount1.getBalance());
        Assertions.assertEquals(0,testAccount2.getBalance());

    }
}
