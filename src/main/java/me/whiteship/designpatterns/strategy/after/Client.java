package me.whiteship.designpatterns.strategy.after;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(new Faster());
        game.redLight(new Normal());
    }
}
