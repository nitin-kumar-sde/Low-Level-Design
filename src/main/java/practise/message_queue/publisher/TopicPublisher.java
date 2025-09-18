package practise.message_queue.publisher;


import practise.message_queue.model.Message;
import practise.message_queue.model.Topic;

/**
 * Abstraction of Publisher publishing to Topic.
 */
public class TopicPublisher {

    private final Topic topic;
    private final Publisher publisher;

    public TopicPublisher(Topic topic, Publisher publisher) {
        this.topic = topic;
        this.publisher = publisher;
    }

    public void publishMessage(final Message message) {
        topic.publish(message);
    }

    public Topic getTopic() {
        return topic;
    }

    public Publisher getPublisher() {
        return publisher;
    }
}
