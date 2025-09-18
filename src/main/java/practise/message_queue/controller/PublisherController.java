package practise.message_queue.controller;


import practise.message_queue.model.Message;
import practise.message_queue.publisher.MessagePublisher;

public class PublisherController {

    public void publishMessage(MessagePublisher messagePublisher,
                               Message message) {
        messagePublisher.publish(message);
    }
}
