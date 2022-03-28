package me.whiteship.designpatterns.visitor.after;

public interface Device {
    void print(Rectangle rectangle);

    void print(Triangle triangle);

    void print(Circle circle);
}
