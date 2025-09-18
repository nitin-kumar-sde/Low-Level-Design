package practise.kafka_streams.publisher;

import practise.kafka_streams.model.Message;
import practise.kafka_streams.model.Topic;
import practise.kafka_streams.model.TopicPublisher;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Publisher {

    private final List<TopicPublisher> topicPublishers;

    public MessagePublisher() {
        this.topicPublishers = new ArrayList<>();
    }

    public List<TopicPublisher> getTopicPublishers() {
        return topicPublishers;
    }

    public void addTopicPublisher(final Topic topic) {
        topicPublishers.add(new TopicPublisher(
                topic, this
        ));
    }

    public void removeTopicPublisher(final TopicPublisher topicPublisher) {
        topicPublishers.remove(topicPublisher);
    }
    @Override
    public void publish(Message message) {

        for(TopicPublisher topicPublisher : this.topicPublishers) {
            topicPublisher.publishMessage(message);
        }
    }

    @Override
    public void publish(String topicId, Message message) {
        for(TopicPublisher topicPublisher : this.topicPublishers) {

            if(topicPublisher.getTopic().getTopicId().equals(topicId))
                topicPublisher.publishMessage(message);
        }
    }
}
