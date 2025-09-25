package practise.notification_system;

import practise.notification_system.controller.NotificationController;
import practise.notification_system.observer.EmailObserver;
import practise.notification_system.observer.NotificationPublisher;
import practise.notification_system.observer.SMSObserver;

public class Main {

    public static void main(String[] args) {

        NotificationPublisher<String> notifier = new NotificationPublisher<>();

        NotificationController controller = new NotificationController(notifier);

        controller.subscribe(new SMSObserver<>("87082*****"));
        controller.subscribe(new EmailObserver<>("nitin.kumar@gmail.com"));

        controller.sendNotification("Hey, Hope you are doing well...");
    }
}
