package practise.message_queue.poller;

import practise.message_queue.model.Partition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MessagePoller implements Poller {

    private final List<PartitionPoller> partitionPollers;
    private final ExecutorService executorService;

    public MessagePoller() {
        this.partitionPollers = new ArrayList<>();
        this.executorService = Executors.newCachedThreadPool();
    }

    @Override
    public void startPolling() {

        for(PartitionPoller partitionPoller : partitionPollers) {
            executorService.submit(partitionPoller);
        }
    }

    @Override
    public void shutdown() {
        this.executorService.shutdown();
    }

    public void addPartitionPoller(Partition partition) {

        final PartitionPoller partitionPoller = new PartitionPoller(partition);
        this.partitionPollers.add(partitionPoller);
        executorService.submit(partitionPoller);
    }
}
