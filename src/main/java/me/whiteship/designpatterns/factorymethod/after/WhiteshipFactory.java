package me.whiteship.designpatterns.factorymethod.after;

public class WhiteshipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
