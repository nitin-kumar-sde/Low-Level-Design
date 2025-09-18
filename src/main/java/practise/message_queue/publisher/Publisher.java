package practise.message_queue.publisher;


import practise.message_queue.model.Message;

public interface Publisher {

    // publishes message to all the topic subscribed.
    void publish(final Message message);

}
