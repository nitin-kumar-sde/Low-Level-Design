package practise.notify_me;

public class SMSObserver implements Observer{

    private final String phoneNumber;

    public SMSObserver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(Product product) {
        System.out.println("Sending SMS to " + phoneNumber
                + " about product: " + product.getName());
    }
}
