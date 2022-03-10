package me.whiteship.designpatterns.singleton;

public class Settings {

//    private static Settings instance;
//    private static final Settings INSTANCE = new Settings();
//    private static volatile Settings instance;

    private Settings() {}

//    public static Settings getInstance() {
//        if (instance == null) {
//            instance = new Settings();
//        }
//
//        return instance;
//    }

    /*
    * thread-safe
    * synchronized
    * 성능 저하가 발생할 수 있음. (블록킹 때문에)
     */
//    public static synchronized Settings getInstance() {
//        if (instance == null) {
//            instance = new Settings();
//        }
//
//        return instance;
//    }

    /*
    * thread-safe
    * eager initialization
    * 만들어두고 쓰지 않으면 손
     */
//    public static Settings getInstance() {
//        return INSTANCE;
//    }

    /*
    * thread-safe
    * double checked locking
    * 인스턴스가 없는 경우에만 블록킹이 진행
    * 생성 후에는 동기화 스
     */
//    public static Settings getInstance() {
//        if (instance == null) {
//            synchronized (Settings.class) {
//                if (instance == null) {
//                    instance = new Settings();
//                }
//            }
//        }
//        return instance;
//    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
