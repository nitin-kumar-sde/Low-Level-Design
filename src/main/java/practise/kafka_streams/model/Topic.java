package practise.kafka_streams.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public class Topic {

    private final String topicName;
    private final String topicId;
    private final List<Message> messages;
    private final List<TopicSubscriber> subscribers;

    private final int retentionLimit;

    public Topic(final String topicName, final String topicId,
                 final int retentionLimit) {
        this.topicName = topicName;
        this.topicId = topicId != null ? topicId : UUID.randomUUID().toString();
        this.retentionLimit = retentionLimit > 0 ? retentionLimit : Integer.MAX_VALUE;
        this.messages = new CopyOnWriteArrayList<>();
        this.subscribers = new CopyOnWriteArrayList<>();
    }

    public Topic(String topicName, String topicId) {
        this(topicName, topicId, Integer.MAX_VALUE);
    }

    public String getTopicName() {
        return topicName;
    }

    public String getTopicId() {
        return topicId;
    }

    public void addMessage(Message message) {
        messages.add(message);
        // notifies all the waiting threads
        for(TopicSubscriber topicSubscriber: subscribers) {
            topicSubscriber.notify();
        }
        enforceRetention();
    }

    public void addSubscriber(TopicSubscriber topicSubscriber) {
        subscribers.add(topicSubscriber);
        enforceRetention();
    }

    public List<Message> getMessages() {
        return Collections.unmodifiableList(messages);
    }

    public Message getLatestMessage() {
        return messages.isEmpty() ? null : messages.get(messages.size() - 1);
    }

    public Message pollMessage(int offset) {
        // handle validations
        return this.messages.get(offset);
    }

    public int getMessageCount() {
        return messages.size();
    }

    private void enforceRetention() {
        if (messages.size() > retentionLimit) {
            // remove oldest messages
            messages.removeFirst();
        }
    }
}
