package singlton;

public class Singlton3 {

    private static class Singlton3Holder{
        private static final Singlton3 instance = new Singlton3();
    }

    private Singlton3(){

    }

    public static final Singlton3 getInstance(){
        return Singlton3Holder.instance;
    }

}
