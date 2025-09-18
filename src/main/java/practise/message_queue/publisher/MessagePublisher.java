package practise.message_queue.publisher;


import practise.message_queue.model.Message;
import practise.message_queue.model.Topic;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Publisher {

    private final List<TopicPublisher> topicPublishers;

    public MessagePublisher() {
        this.topicPublishers = new ArrayList<>();
    }

    @Override
    public void publish(Message message) {

        for(TopicPublisher topicPublisher : this.topicPublishers) {
            topicPublisher.publishMessage(message);
        }
    }

    public void addTopic(final Topic topic) {
        this.topicPublishers.add(
                new TopicPublisher(
                        topic, this
                )
        );
    }
}

