package me.whiteship.designpatterns.visitor.after;

public class Phone implements Device {
    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print rectangle phone");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print triangle phone");
    }

    @Override
    public void print(Circle circle) {
        System.out.println("print circle phone");
    }
}
