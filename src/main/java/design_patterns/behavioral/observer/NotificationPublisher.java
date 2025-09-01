package design_patterns.behavioral.observer;

import design_patterns.behavioral.observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

/**
* Publisher class that maintains a list of subscribers
 * and notifies them of any updates.
 */

public class NotificationPublisher {

    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(final Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(final Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    private void notifySubscribers(final String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }

    public void publish(final String message) {
        System.out.println("Publishing message: " + message);
        notifySubscribers(message);
    }
}
