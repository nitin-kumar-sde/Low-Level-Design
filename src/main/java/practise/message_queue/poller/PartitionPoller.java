package practise.message_queue.poller;

import practise.message_queue.model.Message;
import practise.message_queue.model.Partition;

public class PartitionPoller implements Runnable {

    private final Partition partition;

    public PartitionPoller(Partition partition) {
        this.partition = partition;
    }

    @Override
    public void run() {
        while (true) {
            // fetch next message (blocks if none or one already locked)
            Message message = null;
            try {
                message = partition.pollMessage();
                if (message != null) {
                    System.out.println("[Poller-" + partition.getPartitionId() +
                            "] Consumed: " + message);
                    // simulate processing the message
                    Thread.sleep(200);

                    // acknowledge (remove + mark DELIVERED)
                    partition.deleteMessage();
                }
            }
            catch (InterruptedException exception) {
                System.out.println(exception.getMessage());
            }

        }
    }
}
