package me.whiteship.designpatterns.abstractfacotry.after;

import me.whiteship.designpatterns.abstractfacotry.before.Anchor;
import me.whiteship.designpatterns.abstractfacotry.before.Wheel;

public class WhiteshipProPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
