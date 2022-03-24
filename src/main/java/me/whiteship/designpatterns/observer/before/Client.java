package me.whiteship.designpatterns.observer.before;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User(chatServer);
        user1.sendMessage("디자인패턴", "옵저버 패턴 진행 중");
        user1.sendMessage("hello", "world");

        User user2 = new User(chatServer);
        System.out.println("user2 = " + user2.getMessage("디자인패턴"));

        user1.sendMessage("디자인패턴", "예제 코드");
        System.out.println("user1 = " + user1.getMessage("디자인패턴"));
    }
}
