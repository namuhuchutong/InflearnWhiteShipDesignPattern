package me.whiteship.designpatterns.singleton;

public class App {

    public static void main(String[] args) {
        Settings one = Settings.getInstance();
        Settings two = Settings.getInstance();

        System.out.println(one == two);
    }
}
