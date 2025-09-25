package practise.notification_system.observer;

import practise.notification_system.model.Notification;

public class SMSObserver<T> implements Observer<T> {

    private final String phoneNumber;

    public SMSObserver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(Notification<T> notification) {
        System.out.println("Sent SMS to " + phoneNumber + " - "
                +  notification.getContent());
    }
}
