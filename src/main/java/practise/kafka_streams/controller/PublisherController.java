package practise.kafka_streams.controller;

import practise.kafka_streams.model.Message;
import practise.kafka_streams.publisher.MessagePublisher;

public class PublisherController {

    public void publishMessage(MessagePublisher messagePublisher,
                               Message message) {
        messagePublisher.publish(message);
    }
}
