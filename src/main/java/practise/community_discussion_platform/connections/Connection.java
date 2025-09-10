package practise.community_discussion_platform.connections;

import practise.community_discussion_platform.model.User;

import java.util.UUID;

public class Connection {

    private final UUID id;
    private final User requester;
    private final User receiver;
    private ConnectionStatus status;

    public Connection(User requester, User receiver) {
        this.id = UUID.randomUUID();
        this.requester = requester;
        this.receiver = receiver;
        this.status = ConnectionStatus.PENDING;
    }

    public UUID getId() { return id; }
    public User getRequester() { return requester; }
    public User getReceiver() { return receiver; }
    public ConnectionStatus getStatus() { return status; }
    public void setStatus(ConnectionStatus status) { this.status = status; }

    public boolean involves(User user) {
        return requester.equals(user) || receiver.equals(user);
    }
}
