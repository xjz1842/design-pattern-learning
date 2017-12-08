package singlton;


/**
 * 双检查模式
 */
public class Singlton2 {

    private volatile  static Singlton2  instance = null;

    private Singlton2(){

    }

    public static Singlton2 getInstance(){

        if(instance == null){
            synchronized (Singlton2.class){
                if(instance == null) {
                    instance = new Singlton2();
                }
            }
        }
        return instance;
    }
}
