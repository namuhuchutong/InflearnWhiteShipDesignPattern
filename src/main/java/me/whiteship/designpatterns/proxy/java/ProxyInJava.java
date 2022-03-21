package me.whiteship.designpatterns.proxy.java;

import me.whiteship.designpatterns.proxy.after.DefaultSomethingService;
import me.whiteship.designpatterns.proxy.after.SomethingService;

import java.lang.reflect.Proxy;

public class ProxyInJava {

    public static void main(String[] args) throws InterruptedException {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() throws InterruptedException {
        SomethingService somethingServiceProxy = getGameServiceProxy(new DefaultSomethingService());
        somethingServiceProxy.startSomething();
    }

    private SomethingService getGameServiceProxy(SomethingService service) {
        return (SomethingService) Proxy.newProxyInstance(this.getClass()
                                                             .getClassLoader(),
                                                                new Class[]{SomethingService.class},
                ((proxy, method, args) -> {
                    System.out.println("hello dynamic proxy");
                    method.invoke(service, args);
                    System.out.println("bye");
                    return null;
                }));
    }
}
