package practise.kafka_streams.publisher;

public interface Subscriber {

    void startPolling();

    void shutdown();
}
