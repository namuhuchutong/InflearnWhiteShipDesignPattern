package me.whiteship.designpatterns.chain_of_responsibilities.before;

public class AuthRequestHandler extends RequestHandler {

    @Override
    public void handler(Request request) {
        System.out.println("인증이 되었는가?");
        System.out.println("이 핸들러를 사용할 수 있는 유저인가?");
        super.handler(request);
    }
}
