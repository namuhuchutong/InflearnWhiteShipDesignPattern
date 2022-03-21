package me.whiteship.designpatterns.proxy.after;

public class DefaultSomethingService implements SomethingService {

    @Override
    public void startSomething() {
        System.out.println("welcome");
    }
}
