package practise.notification_system.observer;

import practise.notification_system.model.Notification;

public class EmailObserver<T> implements Observer<T> {

    private final String email;

    public EmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void notify(Notification<T> notification) {
        System.out.println("Sent email to " + email + " - "
                + notification.getContent());
    }
}
