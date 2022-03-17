package me.whiteship.designpatterns.bridge.before;

public class PoolpartyAri implements Champion{

    @Override
    public void move() {
        System.out.println("poolparty ari move");
    }

    @Override
    public void skillQ() {
        System.out.println("poolparty ari q");
    }

    @Override
    public void skillW() {
        System.out.println("poolparty ari w");
    }

    @Override
    public void skillE() {
        System.out.println("poolparty ari e");
    }

    @Override
    public void skillR() {
        System.out.println("poolparty ari r");
    }
}
