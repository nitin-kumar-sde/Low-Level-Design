package practise.notification_system.controller;

import practise.notification_system.model.Notification;
import practise.notification_system.model.TextNotification;
import practise.notification_system.observer.NotificationPublisher;
import practise.notification_system.observer.Observer;

public class NotificationController {


    private NotificationPublisher<String> notifier;

    public NotificationController(NotificationPublisher<String> notifier) {
        this.notifier = notifier;
    }

    public void subscribe(Observer<String> observer) {

        this.notifier.addObserver(observer);
    }

    public void unsubscribe(Observer<String> observer) {

        this.notifier.removeObserver(observer);
    }

    public void sendNotification(String content) {

        // build notification
        // ideally this should be moved to builder class
        final Notification<String> notification  = new TextNotification(content);

        notifier.notifyObservers(notification);
    }
}
