package me.whiteship.designpatterns.factorymethod.after;

public class Client {

    public static void main(String[] args) {
//        Ship whiteship = new WhiteshipFactory().orderShip("WhiteShip", "abc@bac.com");
//        System.out.println("whiteship = " + whiteship);
//
//        Ship blackship = new BlackshipFactory().orderShip("blackship", "asdfsa@adsfa.com");
//        System.out.println("blackship = " + blackship);

        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "abc@dsf.com");
        client.print(new BlackshipFactory(), "blackship", "adsf@asf.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
