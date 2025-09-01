package design_patterns.behavioral.observer.subscriber;

import design_patterns.behavioral.observer.NotificationPublisher;

public class Main {
    public static void main(String[] args) {

        final NotificationPublisher publisher = new NotificationPublisher();

        final Subscriber emailSubscriber = new EmailSubscriber("john.doe@example.com");
        final Subscriber smsSubscriber = new SMSSubscriber("+91-9876543210");

        // Subscribe users
        publisher.subscribe(emailSubscriber);
        publisher.subscribe(smsSubscriber);

        // Send a notification
        publisher.publish("🚨New video uploaded: Design Patterns in Java!");
    }
}
