package me.whiteship.designpatterns.factorymethod.after;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepare(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);

        return ship;
    }

    Ship createShip();


    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("There is no ship name");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("There is no email");
        }
    }

    private void prepare(String name) {
        System.out.println(name + "is creating now");
    }
    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + "is done");
    }
}
