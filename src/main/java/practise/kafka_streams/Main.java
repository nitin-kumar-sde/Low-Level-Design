package practise.kafka_streams;

import practise.kafka_streams.controller.KafkaController;
import practise.kafka_streams.controller.PublisherController;
import practise.kafka_streams.controller.SubscriberController;
import practise.kafka_streams.model.Message;
import practise.kafka_streams.model.Topic;
import practise.kafka_streams.publisher.MessagePublisher;
import practise.kafka_streams.publisher.MessageSubscriber;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        KafkaController kafkaController = new KafkaController();
        PublisherController publisherController = new PublisherController();
        SubscriberController subscriberController = new SubscriberController();

        Topic topic = kafkaController.createTopic("orders");

        // --- Step 2: Create Publisher + Subscriber ---
        MessagePublisher publisher = new MessagePublisher();
        publisher.addTopicPublisher(topic);

        final MessageSubscriber subscriber = new MessageSubscriber();

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

        System.out.println("\nDemo finished.");
    }

}
