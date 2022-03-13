package me.whiteship.designpatterns.factorymethod.before;

public class WhiteshipFactory {

    public static Ship orderShip(String name, String email) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("There is no ship name");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("There is no email");
        }

        prepare(name);

        Ship ship = new Ship();
        ship.setName(name);

        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("\uD83D\uDEE5");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("⚓");
        }

        if (name.equalsIgnoreCase("whiteship")) {
            ship.setColor("whiteship");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("black");
        }

        sendEmailTo(email, ship);

        return ship;

    }

    private static void prepare(String name) {
        System.out.println(name + "is creating now");
    }
    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + "is done");
    }
}
