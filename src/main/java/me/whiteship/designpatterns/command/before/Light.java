package me.whiteship.designpatterns.command.before;

public class Light {

    private boolean isOn;

    public void on() {
        System.out.println("Light's on");
        this.isOn = true;
    }

    public void off() {
        System.out.println("Light's off");
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }
}
