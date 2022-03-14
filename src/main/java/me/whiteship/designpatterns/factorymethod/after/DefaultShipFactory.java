package me.whiteship.designpatterns.factorymethod.after;

public abstract class DefaultShipFactory implements ShipFactory {

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + "is done");
    }

}
