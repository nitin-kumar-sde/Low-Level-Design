package practise.message_queue.model;

import java.io.Serializable;

public final class Message implements Serializable {

    private final String id;
    private final String content;
    private  MessageStatus status;

    public Message(String id, String content) {
        this.id = id;
        this.content = content;
        this.status = MessageStatus.CREATED;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setStatus(MessageStatus status) {
        this.status = status;
    }

}

