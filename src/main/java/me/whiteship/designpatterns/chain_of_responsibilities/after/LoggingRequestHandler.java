package me.whiteship.designpatterns.chain_of_responsibilities.after;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("logging?");
        super.handle(request);
    }
}
