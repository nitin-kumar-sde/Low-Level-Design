package practise.notification_system.model;

/**
 * Simple text Notification.
 */
public class TextNotification extends Notification<String> {

    public TextNotification(String content) {
        super(content);
    }

    @Override
    public String getContent() {
        return content;
    }
}
