package me.whiteship.designpatterns.command.after;

import me.whiteship.designpatterns.command.before.Light;

public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        Button button = new Button(new LIghtOnCommand(new Light()));
        button.press();
        button.press();
        button.press();
    }
}
