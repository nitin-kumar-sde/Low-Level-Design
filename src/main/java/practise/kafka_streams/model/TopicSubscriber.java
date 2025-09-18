package practise.kafka_streams.model;

import practise.kafka_streams.publisher.Subscriber;

import java.util.concurrent.atomic.AtomicInteger;

public class TopicSubscriber implements Runnable {

    private final Topic topic;
    private final Subscriber subscriber;
    private AtomicInteger offset;

    public TopicSubscriber(final Topic topic, final Subscriber subscriber) {
        this.topic = topic;
        this.subscriber = subscriber;
        this.offset = new AtomicInteger(0);
    }

    public Topic getTopic() {
        return topic;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    @Override
    public void run() {
        while (true) {
            Message message = null;
            synchronized (this) {
                // Wait until there is a new message (offset is less than the number of messages)
                while (this.offset.get() >= topic.getMessages().size()) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        // handle
                        return;
                    }
                }
                // Retrieve the next message and increment the offset
                int currentOffset = offset.getAndIncrement();
                message = topic.getMessages().get(currentOffset);
                System.out.println("Read - " + message);
            }
        }
    }
}