package me.whiteship.designpatterns.command.after;

import me.whiteship.designpatterns.command.before.Light;

public class LIghtOnCommand implements Command {

    private Light light;

    public LIghtOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
       light.on();
    }
}
