package me.whiteship.designpatterns.observer.after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("hello");
        User user2 = new User("world");

        chatServer.register("csgo", user1);
        chatServer.register("csgo", user2);

        chatServer.register("디자인패턴", user1);

        chatServer.sendMessage(user1, "csgo", "csgo is a good game");
        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴");
    }
}
