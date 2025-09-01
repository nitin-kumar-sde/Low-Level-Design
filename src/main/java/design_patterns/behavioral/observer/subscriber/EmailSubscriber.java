package design_patterns.behavioral.observer.subscriber;

/**
 * Concrete Observer that simulates sending an email notification.
 */
public class EmailSubscriber implements Subscriber {

    private final String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }
    @Override
    public void update(String message) {
        System.out.println("Email sent to " + email + ": " + message);
    }
}
