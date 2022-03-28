package me.whiteship.designpatterns.visitor.after;

public class Watch implements Device {
    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print rectangle watch");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print triangle watch");
    }

    @Override
    public void print(Circle circle) {
        System.out.println("print circle watch");
    }
}
