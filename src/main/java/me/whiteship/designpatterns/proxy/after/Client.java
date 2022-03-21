package me.whiteship.designpatterns.proxy.after;

public class Client {

    public static void main(String[] args) throws InterruptedException {
//        GameService gameService = new GameServiceProxy();
//        gameService.startGame();

        SomethingService somethingService = new SomethingServiceProxy(new DefaultSomethingService());
        somethingService.startSomething();
    }
}
