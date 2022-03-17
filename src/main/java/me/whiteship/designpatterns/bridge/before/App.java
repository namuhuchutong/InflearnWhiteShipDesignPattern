package me.whiteship.designpatterns.bridge.before;

public class App {

    public static void main(String[] args) {
        Champion kdaAri = new KdaAri();
        kdaAri.skillE();
        kdaAri.skillQ();
    }
}
