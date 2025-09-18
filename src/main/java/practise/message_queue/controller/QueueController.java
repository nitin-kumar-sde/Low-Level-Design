package practise.message_queue.controller;



import practise.message_queue.model.Topic;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class QueueController {

    private final ConcurrentHashMap<String, Topic> topics;
    private final AtomicInteger topicIdCounter;

    public QueueController() {
        topics = new ConcurrentHashMap<>();
        topicIdCounter = new AtomicInteger(0);
    }

    public Topic createTopic(String topicName) {
        final String topicId = String.valueOf(topicIdCounter.incrementAndGet());
        final Topic topic = new Topic(topicName, 10);
        topics.put(topicId, topic);
        System.out.println("Created topic: " + topicName + " with id: " + topicId);
        return topic;
    }

}
