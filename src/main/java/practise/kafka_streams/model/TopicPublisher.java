package practise.kafka_streams.model;


import practise.kafka_streams.publisher.Publisher;

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
        topic.addMessage(message);
    }

    public Topic getTopic() {
        return topic;
    }

    public Publisher getPublisher() {
        return publisher;
    }
}