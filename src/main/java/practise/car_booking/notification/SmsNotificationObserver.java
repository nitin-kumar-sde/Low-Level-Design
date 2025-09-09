package practise.car_booking.notification;


public class SmsNotificationObserver implements NotificationObserver {

    @Override
    public void notify(String message) {
        System.out.println("📩 Sending SMS to Rider: | Msg: " + message);
    }
}