package me.whiteship.designpatterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Settings one = Settings.getInstance();
        Settings two = Settings.getInstance();
        System.out.println(one == two);

        // Reflection
        Constructor<Settings> declaredConstructor = Settings.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Settings settings = declaredConstructor.newInstance();
        System.out.println(settings == one);

        // Serialization
        Settings settings2 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (Settings) in.readObject();
        }
        System.out.println(settings2 == one);

        // 리플렉션 방지 (enum은 reflection을 사용할 수 없음)
//        SettingsEnum settings3 = null;
//        Constructor<?>[] constructors = SettingsEnum.class.getDeclaredConstructors();
//        for (Constructor<?> constructor : constructors) {
//            constructor.setAccessible(true);
//            settings3 = (SettingsEnum) constructor.newInstance("INSTANCE");
//        }

        // Enum Serialization
        SettingsEnum settings1 = SettingsEnum.INSTANCE;
        SettingsEnum settings4 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings4 = (SettingsEnum) in.readObject();
        }
        System.out.println(settings4 == settings1);


    }
}