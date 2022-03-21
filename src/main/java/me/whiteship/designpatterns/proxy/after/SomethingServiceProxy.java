package me.whiteship.designpatterns.proxy.after;

public class SomethingServiceProxy implements SomethingService {

    private SomethingService somethingService;

    public SomethingServiceProxy(SomethingService somethingService) {
        this.somethingService = somethingService;
    }

    @Override
    public void startSomething() throws InterruptedException {
        long millis = System.currentTimeMillis();
        somethingService.startSomething();
        Thread.sleep(1000L);
        System.out.println(System.currentTimeMillis() - millis);
    }
}
