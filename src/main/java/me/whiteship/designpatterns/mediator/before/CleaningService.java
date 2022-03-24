package me.whiteship.designpatterns.mediator.before;

public class CleaningService {

    public void clean(Gym gym) {
        System.out.println("cleaning gym = " + gym);
    }

    public void getTower(Guest guest, int numberOfTower) {
        System.out.println(numberOfTower + "towers to" + guest);
    }

    public void clean(Restaurant restaurant) {
        System.out.println("clean restaurant = " + restaurant);
    }
}
