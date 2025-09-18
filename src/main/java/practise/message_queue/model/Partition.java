package practise.message_queue.model;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Partition {

    private final int partitionId;
    private final ConcurrentLinkedDeque<Message> queue = new ConcurrentLinkedDeque<>();
    private Message lockedMessage; // only one locked message per partition

    public Partition(int partitionId) {
        this.partitionId = partitionId;
    }

    public int getPartitionId() {
        return partitionId;
    }

    public synchronized void addMessage(final Message message) {
        message.setStatus(MessageStatus.PUBLISHED);
        queue.addLast(message);
        if (queue.size() == 1) {
            notifyAll();
        }
    }

    public Message pollMessage() throws InterruptedException {
        while (queue.isEmpty() || lockedMessage != null) {
            wait();
        }
        lockedMessage = queue.peekFirst();
        if (lockedMessage != null) {
            lockedMessage.setStatus(MessageStatus.LOCKED);
            wait();
        }
        return lockedMessage;
    }

    /**
     * Delete the locked message (acknowledge delivery).
     */
    public synchronized void deleteMessage() {
        if (lockedMessage != null) {
            lockedMessage.setStatus(MessageStatus.DELIVERED);
            queue.pollFirst(); // remove head (maintains ordering)
            lockedMessage = null;
            notifyAll();
        }
    }
}
