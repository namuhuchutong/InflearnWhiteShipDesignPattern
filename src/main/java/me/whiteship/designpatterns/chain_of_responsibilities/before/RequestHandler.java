package me.whiteship.designpatterns.chain_of_responsibilities.before;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println("request = " + request.getBody());
    }
}
