import Ex3.PhoneBill;
import Ex3.PhoneCall;
import org.junit.jupiter.api.Test;

public class PhoneBillTest {
    @Test
    public void testPhoneBillAddCallBalanceAndPrint(){
        PhoneBill bill1 = new PhoneBill(0.75, 5000);

        bill1.addPhoneCall(new PhoneCall(120));
        bill1.addPhoneCall(new PhoneCall(75));

        bill1.checkBalance();

        bill1.printBill();

        PhoneBill bill2 = new PhoneBill(0.75, 3000);

        bill2.addPhoneCall(new PhoneCall(120));
        bill2.addPhoneCall(new PhoneCall(175));
        bill2.addPhoneCall(new PhoneCall(27));


        bill2.updatePricing(1);

        bill2.printBill();
    }
}
