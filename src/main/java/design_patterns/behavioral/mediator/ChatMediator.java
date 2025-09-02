package design_patterns.behavioral.mediator;

/**
 * Mediator interface defining the contract for communication between users.
 */
public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
