package me.whiteship.designpatterns.templatecallback;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process(((result1, number) -> result1 += number));
        System.out.println(result);
    }
}
