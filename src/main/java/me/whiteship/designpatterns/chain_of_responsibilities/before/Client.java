package me.whiteship.designpatterns.chain_of_responsibilities.before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("hello im body");
        RequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler.handler(request);
    }
}
