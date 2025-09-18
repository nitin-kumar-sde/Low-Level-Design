package practise.message_queue;


import practise.message_queue.controller.PublisherController;
import practise.message_queue.controller.QueueController;
import practise.message_queue.controller.SubscriberController;
import practise.message_queue.model.Message;
import practise.message_queue.model.Topic;
import practise.message_queue.poller.MessagePoller;
import practise.message_queue.publisher.MessagePublisher;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        QueueController kafkaController = new QueueController();
        PublisherController publisherController = new PublisherController();
        SubscriberController subscriberController = new SubscriberController();

        Topic topic = kafkaController.createTopic("orders");

        // --- Step 2: Create Publisher + Subscriber ---
        MessagePublisher publisher = new MessagePublisher();
        publisher.addTopic(topic);

        final MessagePoller subscriber = new MessagePoller();

        // --- Step 3: Subscribe ---
        subscriberController.addSubscription(subscriber, topic);

        // --- Step 4: Start Subscriber (background polling) ---
        subscriberController.startConsumer(subscriber);

        // --- Step 5: Publish some messages ---
        System.out.println("\nPublishing messages...");
        for (int i = 1; i <= 5; i++) {
            Message msg = new Message(null, "Order-" + i);
            publisherController.publishMessage(publisher, msg);
            Thread.sleep(300); // simulate delay between messages
        }

        // --- Step 6: Let subscriber process ---
        Thread.sleep(2000);

        // --- Step 7: Shutdown subscriber ---
        subscriberController.shutConsumer(subscriber);
    }
}
