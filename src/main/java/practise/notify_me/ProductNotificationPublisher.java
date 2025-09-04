package practise.notify_me;

import java.util.List;

public class ProductNotificationPublisher {

    private final List<Observer> notifiers;

    public ProductNotificationPublisher(List<Observer> notifiers) {
        this.notifiers = notifiers;
    }

    public void addObserver(final Observer observer) {
        notifiers.add(observer);
    }

    public void removeObserver(final Observer observer) {
        notifiers.remove(observer);
    }

    public void notifyObservers(final Product product) {
        // notify all the subscribed observers
        for(Observer observer : notifiers) {
            observer.notify(product);
        }
    }
}
