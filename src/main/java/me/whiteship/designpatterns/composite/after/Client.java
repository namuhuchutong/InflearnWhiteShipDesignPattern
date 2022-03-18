package me.whiteship.designpatterns.composite.after;

public class Client {

    public static void main(String[] args) {

        Component a = new Item("a", 10);
        Component b = new Item("b", 20);

        Bag bag = new Bag();
        bag.add(a);
        bag.add(b);
        Client client = new Client();
        client.printPrice(a);
        client.printPrice(bag);
    }

    private void printPrice(Component item) {
        System.out.println("item = " + item.getPrice());
    }
}
