package practise.notification_system.observer;

import practise.notification_system.model.Notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationPublisher<T> implements NotificationSubject<T> {

    private final List<Observer<T>> observers;

    public NotificationPublisher() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void notifyObservers(final Notification<T> notification) {

        // notify all the subscribed observers
        for(Observer<T> observer : observers) {

            observer.notify(notification);
        }
    }

    @Override
    public void addObserver(Observer<T> observer) {
        // perform validations.
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<T> observer) {
        // check if already exists
        this.observers.remove(observer);
    }
}
