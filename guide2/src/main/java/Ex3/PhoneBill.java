package Ex3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class PhoneBill {

    private final List<PhoneCall> calls;
    private double secondsPricing;
    private float credit;

    public PhoneBill(double secondsPricing, float credit) {
        this.secondsPricing = secondsPricing;
        calls = new ArrayList<>();
        this.credit = credit;
    }

    public void updatePricing(double secondsPricing) {
        this.secondsPricing = secondsPricing;
    }
    
    public void addPhoneCall(PhoneCall phoneCall){
        calls.add(phoneCall);
    }
    
    public void printBill(){
        long total = 0;
        for (int i = 0; i < calls.size(); i++) {
            long callPrice = (long) (calls.get(i).getCallDuration() * secondsPricing);
            total = total + callPrice;
            System.out.println("Phone Call " + (i+1) +": " + callPrice + "$");
        }
        System.out.println("------");
        System.out.println("Total: " + total + "$");
        System.out.println("------");
        credit = credit - total;
        System.out.println("Credit: " + credit + "$");
        System.out.println("------");

    }

    public void checkBalance() {
        System.out.println("Credit: " + credit + "$");
    }

}
