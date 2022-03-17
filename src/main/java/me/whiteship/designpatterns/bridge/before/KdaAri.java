package me.whiteship.designpatterns.bridge.before;

public class KdaAri implements Champion{
    @Override
    public void move() {
        System.out.println("kda ari move");
    }

    @Override
    public void skillQ() {
        System.out.println("kda ari q");
    }

    @Override
    public void skillW() {
        System.out.println("kda ari w");
    }

    @Override
    public void skillE() {
        System.out.println("kda ari e");
    }

    @Override
    public void skillR() {
        System.out.println("kda ari r");
    }
}
