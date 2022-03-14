package me.whiteship.designpatterns.abstractfacotry.before;

public abstract class DefaultShipFactory implements ShipFactory {

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + "is done");
    }

}
