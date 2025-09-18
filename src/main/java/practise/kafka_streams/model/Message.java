package practise.kafka_streams.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public class Message implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final String id;
    private final String content;

    public Message(String id, String content) {
        this.id = id != null ? id : UUID.randomUUID().toString();
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

