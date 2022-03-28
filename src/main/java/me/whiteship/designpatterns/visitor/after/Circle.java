package me.whiteship.designpatterns.visitor.after;

public class Circle implements Shape{
    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
