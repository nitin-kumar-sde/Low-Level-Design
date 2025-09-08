package practise.parking_lot.strategy;

public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public boolean pay(double amount) {
        System.out.println("💵 Paying " + amount + " in cash");
        return true;
    }
}

