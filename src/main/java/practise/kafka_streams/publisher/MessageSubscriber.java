package practise.kafka_streams.publisher;

import practise.kafka_streams.model.Topic;
import practise.kafka_streams.model.TopicSubscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MessageSubscriber implements Subscriber {

    private final List<TopicSubscriber> topicSubscribers;
    private final ExecutorService executorService;
    public List<TopicSubscriber> getTopicSubscribers() {
        return topicSubscribers;
    }

    public MessageSubscriber() {
        this.topicSubscribers = new ArrayList<>();
        this.executorService = Executors.newCachedThreadPool();
    }

    @Override
    public void startPolling() {
        for(TopicSubscriber topicSubscriber : topicSubscribers) {
            executorService.submit(topicSubscriber);
        }
    }

    @Override
    public void shutdown() {
        this.executorService.shutdown();
    }

    public void addTopicSubscriber(Topic topic) {
        TopicSubscriber topicSubscriber = new TopicSubscriber(
                topic, this
        );
        this.topicSubscribers.add(topicSubscriber);
        executorService.submit(topicSubscriber);
    }
}
