package me.whiteship.designpatterns.abstractfacotry.after;

import me.whiteship.designpatterns.abstractfacotry.before.Ship;
import me.whiteship.designpatterns.abstractfacotry.before.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = (ShipFactory) new WhiteshipFactory(new WhiteshipProPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println("ship = " + ship.getAnchor().getClass());
        System.out.println("ship = " + ship.getWheel().getClass());
    }
}
