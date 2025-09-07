package practise.vending_machine.payment;

public class UPIPaymentStrategy implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
