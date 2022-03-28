package me.whiteship.designpatterns.templatemethod.after;

public class Multiply extends FileProcessor {

    public Multiply(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int number) {
        return result *= number;
    }
}
