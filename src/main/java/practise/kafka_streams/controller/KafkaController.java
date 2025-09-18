package practise.kafka_streams.controller;

import practise.kafka_streams.model.Topic;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class KafkaController {

    private final ConcurrentHashMap<String, Topic> topics;
    private final AtomicInteger topicIdCounter;

    public KafkaController() {
        topics = new ConcurrentHashMap<>();
        topicIdCounter = new AtomicInteger(0);
    }

    public Topic createTopic(String topicName) {
        final String topicId = String.valueOf(topicIdCounter.incrementAndGet());
        final Topic topic = new Topic(topicName, topicId);
        topics.put(topicId, topic);
        System.out.println("Created topic: " + topicName + " with id: " + topicId);
        return topic;
    }

}
