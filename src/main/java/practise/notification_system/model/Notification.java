package practise.notification_system.model;


import java.util.UUID;

import static practise.notification_system.model.NotificationStatus.CREATED;

public abstract class Notification<T> {

    protected T content;
    private UUID id;
    private NotificationStatus status;

    public Notification(T content) {
        this.content = content;
        this.id = UUID.randomUUID();
        this.status = CREATED;
    }

    public abstract T getContent();

    public UUID getId() {
        return id;
    }
}
