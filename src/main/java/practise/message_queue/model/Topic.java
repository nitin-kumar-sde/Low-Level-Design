package practise.message_queue.model;

import java.util.ArrayList;
import java.util.List;

public class Topic {

    private final String topicName;
    private final List<Partition> partitions;

    public Topic(String topicName, int partitionCount) {
        this.topicName = topicName;
        this.partitions = new ArrayList<>();
        for (int i = 0; i < partitionCount; i++) {
            partitions.add(new Partition(i));
        }
    }

    public String getTopicName() {
        return topicName;
    }

    public List<Partition> getPartitions() {
        return partitions;
    }

    /**
     * Publish message using hash-based partitioning.
     * If key is null, fallback to partition 0.
     */
    public void publish(Message message) {
        int partitionIndex = 0;
        if (message!= null) {
            partitionIndex = Math.abs(message.hashCode()) % partitions.size();
        }
        assert message != null;
        partitions.get(partitionIndex).addMessage(message);
    }

    public Partition getPartition(int partitionId) {
        if (partitionId < 0 || partitionId >= partitions.size()) {
            throw new IllegalArgumentException("Invalid partition ID");
        }
        return partitions.get(partitionId);
    }
}


