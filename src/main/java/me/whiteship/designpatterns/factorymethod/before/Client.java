package me.whiteship.designpatterns.factorymethod.before;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = WhiteshipFactory.orderShip("Whiteship", "abc@abc.com");
        System.out.println("whiteship = " + whiteship);
        Ship blackship = WhiteshipFactory.orderShip("Blackship", "abc@abc.com");
        System.out.println("blackship = " + blackship);
    }
}
