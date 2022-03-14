package me.whiteship.designpatterns.abstractfacotry.after;

import me.whiteship.designpatterns.abstractfacotry.before.Anchor;
import me.whiteship.designpatterns.abstractfacotry.before.Wheel;
import me.whiteship.designpatterns.abstractfacotry.before.WhiteWheel;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
