package me.whiteship.designpatterns.abstractfacotry.after;

import me.whiteship.designpatterns.abstractfacotry.before.DefaultShipFactory;
import me.whiteship.designpatterns.abstractfacotry.before.Ship;
import me.whiteship.designpatterns.abstractfacotry.before.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }

}