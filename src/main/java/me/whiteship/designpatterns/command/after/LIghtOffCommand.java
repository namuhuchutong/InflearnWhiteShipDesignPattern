package me.whiteship.designpatterns.command.after;

import me.whiteship.designpatterns.command.before.Light;

public class LIghtOffCommand implements Command {

    private Light light;

    public LIghtOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
       light.off();
    }
}
