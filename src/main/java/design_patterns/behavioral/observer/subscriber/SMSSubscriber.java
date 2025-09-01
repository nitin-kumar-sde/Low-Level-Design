package design_patterns.behavioral.observer.subscriber;

/**
 * Concrete Observer that simulates sending an SMS notification.
 */
public class SMSSubscriber implements Subscriber {
    private final String phoneNumber;

    public SMSSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }
}
