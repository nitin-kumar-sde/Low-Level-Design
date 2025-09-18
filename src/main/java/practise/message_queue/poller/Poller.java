package practise.message_queue.poller;

public interface Poller {

    void startPolling();
    void shutdown();
}
