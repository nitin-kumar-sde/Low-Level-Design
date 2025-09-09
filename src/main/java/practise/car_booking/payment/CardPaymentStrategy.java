package practise.car_booking.payment;


public class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("💳 Processing card payment of Rs." + amount + " for ride ");
    }
}

