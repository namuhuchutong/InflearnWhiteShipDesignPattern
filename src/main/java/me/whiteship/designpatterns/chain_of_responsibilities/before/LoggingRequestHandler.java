package me.whiteship.designpatterns.chain_of_responsibilities.before;

public class LoggingRequestHandler extends RequestHandler {

    @Override
    public void handler(Request request) {
        System.out.println("Logging");
    }
}
