package practise.notification_system.observer;

import practise.notification_system.model.Notification;

public interface Observer<T> {

    void notify(Notification<T> notification);
}
