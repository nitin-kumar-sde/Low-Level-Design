package practise.kafka_streams.publisher;

import practise.kafka_streams.model.Message;

public interface Publisher {

    // publishes message to all the topic subscribed.
    void publish(final Message message);

    // publishes message to a topic subscribed.
    void publish(final String topicId,
                 final Message message);
}
