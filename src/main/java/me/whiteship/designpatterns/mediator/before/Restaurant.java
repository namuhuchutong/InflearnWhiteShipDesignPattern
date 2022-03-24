package me.whiteship.designpatterns.mediator.before;

public class Restaurant {

    private CleaningService cleaningService = new CleaningService();

    public void dinner(Guest guest) {
        System.out.println("dinner guest = " + guest);
    }

    public void clean() {
        cleaningService.clean(this);
    }
}
