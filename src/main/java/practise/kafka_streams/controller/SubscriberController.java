package practise.kafka_streams.controller;

import practise.kafka_streams.model.Topic;
import practise.kafka_streams.publisher.MessageSubscriber;

public class SubscriberController {

    public void addSubscription(final MessageSubscriber messageSubscriber,
                                final Topic topic) {
        messageSubscriber.addTopicSubscriber(topic);
    }

    public void startConsumer(MessageSubscriber messageSubscriber) {
        messageSubscriber.startPolling();
    }

    public void shutConsumer(MessageSubscriber messageSubscriber) {
        messageSubscriber.shutdown();
    }

}
