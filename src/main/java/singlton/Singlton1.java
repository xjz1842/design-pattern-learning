package singlton;

/**
 * 懒汉模式
 */
public class Singlton1 {

    private static Singlton1 instance = null;

    private Singlton1() {

    }

    public static Singlton1 getInstance() {

        if (instance == null) {
            instance = new Singlton1();
        }
        return instance;
    }
}

