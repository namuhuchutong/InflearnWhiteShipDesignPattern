package me.whiteship.designpatterns.composite.before;

public class Client {

    public static void main(String[] args) {
        Item a = new Item("a", 10);
        Item b = new Item("b", 20);
        
        Bag bag = new Bag();
        bag.add(a);
        bag.add(b);
        
        Client client = new Client();
        client.printPrice(a);
        client.printPrice(bag);
    }
    
    private void printPrice(Item item) {
        System.out.println("item = " + item.getPrice());
    }
    
    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println("sum = " + sum);
    }
}
