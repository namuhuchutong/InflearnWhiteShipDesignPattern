package me.whiteship.designpatterns.proxy.before;

public class Client {

    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.startGame();
        // 기존 코드를 변경하지 않고 시간을 측정하고 싶다면 어떻게 수정해야 하는가?
    }
}
