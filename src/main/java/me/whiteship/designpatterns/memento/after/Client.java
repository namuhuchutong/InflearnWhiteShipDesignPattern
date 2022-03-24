package me.whiteship.designpatterns.memento.after;

import java.io.*;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave save = game.save();

        game.setRedTeamScore(12);
        game.setBlueTeamScore(22);

        game.restore(save);

        System.out.println("game = " + game.getBlueTeamScore());
        System.out.println("game = " + game.getRedTeamScore());

        try (FileOutputStream fileOutputStream = new FileOutputStream("GameSave.hex");
             ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)) {
            out.writeObject(game);
        }

        try(FileInputStream fileInputStream = new FileInputStream("GameSave.hex");
            ObjectInputStream in = new ObjectInputStream(fileInputStream)) {
            game = (Game) in.readObject();
            System.out.println("game = " + game.getRedTeamScore());
            System.out.println("game = " + game.getBlueTeamScore());
        }
    }
}