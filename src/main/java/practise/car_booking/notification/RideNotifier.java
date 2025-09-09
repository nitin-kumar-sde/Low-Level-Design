package practise.car_booking.notification;

import java.util.List;

public class RideNotifier implements Notifier {

    private final List<NotificationObserver> observers;

    public RideNotifier(List<NotificationObserver> observers) {
        this.observers = observers;
    }

    public void addObserver(NotificationObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(NotificationObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notify(String message) {

        for(NotificationObserver observer : observers) {
            observer.notify(message);
        }
    }
}
