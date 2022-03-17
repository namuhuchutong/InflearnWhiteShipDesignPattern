package me.whiteship.designpatterns.bridge.after;

public class App {

    public static void main(String[] args) {
        Champion kda = new Ari(new Kda());
        kda.skillE();
        kda.move();
    }
}
