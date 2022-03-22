package me.whiteship.designpatterns.command.before;

public class Game {

    private boolean isStarted;

    public void start() {
        System.out.println("Game start");
        this.isStarted = true;
    }

    public void end() {
        System.out.println("End game");
        this.isStarted = false;
    }

    public boolean isStarted() {
        return isStarted;
    }
}
