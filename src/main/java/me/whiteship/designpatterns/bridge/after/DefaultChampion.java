package me.whiteship.designpatterns.bridge.after;

public class DefaultChampion implements Champion{

    private Skin skin;

    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move\n", skin.getName(), this.name);
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s q\n", skin.getName(), this.name);
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s w\n", skin.getName(), this.name);
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s e\n", skin.getName(), this.name);
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s r\n", skin.getName(), this.name);
    }
}
