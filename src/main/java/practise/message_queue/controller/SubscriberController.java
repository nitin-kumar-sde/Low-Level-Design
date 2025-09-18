package practise.message_queue.controller;


import practise.message_queue.model.Partition;
import practise.message_queue.model.Topic;
import practise.message_queue.poller.MessagePoller;

import java.util.List;

public class SubscriberController {

    public void addSubscription(final MessagePoller messagePoller,
                                final Topic topic) {
        List<Partition> partitions = topic.getPartitions();
        for(Partition partition : partitions ) {
            messagePoller.addPartitionPoller(partition);
        }

    }

    public void startConsumer(MessagePoller messagePoller) {
        messagePoller.startPolling();
    }

    public void shutConsumer(MessagePoller messagePoller) {
        messagePoller.shutdown();
    }

}
