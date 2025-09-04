package practise.notify_me;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("Laptop", 101);

        ProductNotificationPublisher notifier = new ProductNotificationPublisher(
                List.of(new SMSObserver("+1234567890"),
                        new EmailObserver("nitin***@gmail.com")));

        notifier.notifyObservers(product);
    }
}
