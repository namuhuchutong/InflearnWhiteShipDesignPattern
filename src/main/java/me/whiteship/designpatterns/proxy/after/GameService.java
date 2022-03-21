package me.whiteship.designpatterns.proxy.after;

public class GameService {

    public void startGame() throws InterruptedException {
        System.out.println("game start");
        Thread.sleep(1000L);
    }
}
