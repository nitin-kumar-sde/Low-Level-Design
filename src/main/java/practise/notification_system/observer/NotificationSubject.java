package practise.notification_system.observer;

import practise.notification_system.model.Notification;

public interface NotificationSubject<T> {

    void addObserver(Observer<T> observer);

    void removeObserver(Observer<T> observer);

    void notifyObservers(Notification<T> notification);

}
