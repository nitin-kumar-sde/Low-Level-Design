package practise.community_discussion_platform.connections;

import practise.community_discussion_platform.model.*;
import java.util.*;

public class ConnectionManager {

    private final Map<UUID, List<Connection>> connectionRequests = new HashMap<>();


    public Connection sendRequest(final User from, final User to) {
        final Connection connection = new Connection(from, to);
        connectionRequests.putIfAbsent(from.getUserId(), new ArrayList<>());
        connectionRequests.putIfAbsent(to.getUserId(), new ArrayList<>());

        connectionRequests.get(from.getUserId()).add(connection);
        connectionRequests.get(to.getUserId()).add(connection);

        return connection;
    }


    public void acceptRequest(Connection connection) {
        connection.setStatus(ConnectionStatus.ACCEPTED);
    }

    public void rejectRequest(Connection connection) {
        connection.setStatus(ConnectionStatus.REJECTED);
    }

    public void blockUser(Connection connection) {
        connection.setStatus(ConnectionStatus.BLOCKED);
    }

    public List<User> getFriends(User user) {
        return connectionRequests.getOrDefault(user.getUserId(), List.of())
                .stream()
                .filter(c -> c.getStatus() == ConnectionStatus.ACCEPTED)
                .map(c -> c.getRequester().equals(user) ? c.getReceiver() : c.getRequester())
                .toList();
    }


    public List<Connection> getPendingRequests(User user) {
        return connectionRequests.getOrDefault(user.getUserId(), List.of())
                .stream()
                .filter(c -> c.getReceiver().equals(user) && c.getStatus() == ConnectionStatus.PENDING)
                .toList();
    }


    public List<Connection> getSentRequests(User user) {
        return connectionRequests.getOrDefault(user.getUserId(), List.of())
                .stream()
                .filter(c -> c.getRequester().equals(user) && c.getStatus() == ConnectionStatus.PENDING)
                .toList();
    }
}

