package practise.car_booking.notification;

import practise.car_booking.booking.Ride;

public class NotificationManager {

    private final Notifier notifier;

    public NotificationManager(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendNotification(final Ride ride) {
        // checks status of ride and notifies
        // in prod will be split into multiple functions
        // we can use decorator pattern to add addons like function signature.
        notifier.notify("Payment done successfully ...");
    }
}
