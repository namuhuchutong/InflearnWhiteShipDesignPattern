package me.whiteship.designpatterns.abstractfacotry.after;

import me.whiteship.designpatterns.abstractfacotry.before.Anchor;
import me.whiteship.designpatterns.abstractfacotry.before.Wheel;
import me.whiteship.designpatterns.abstractfacotry.before.WhiteAnchor;
import me.whiteship.designpatterns.abstractfacotry.before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
