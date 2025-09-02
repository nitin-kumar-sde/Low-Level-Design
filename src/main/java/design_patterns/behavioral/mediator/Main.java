package design_patterns.behavioral.mediator;

public class Main {

    public static void main(String[] args) {
        final ChatMediator chatRoom = new ChatRoom();

        final User nitin = new ChatUser(chatRoom, "Nitin");
        final User john = new ChatUser(chatRoom, "John");
        final User emma = new ChatUser(chatRoom, "Emma");

        chatRoom.addUser(nitin);
        chatRoom.addUser(john);
        chatRoom.addUser(emma);

        nitin.send("Hello everyone! 👋");
        emma.send("Hi Nitin! 🙌");
    }
}
