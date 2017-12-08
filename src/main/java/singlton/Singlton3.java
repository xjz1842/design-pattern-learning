package singlton;

public class Singlton3 {

    private static class Singlton3Holder{
        private static Singlton3 instance = new Singlton3();
    }

    public static Singlton3 getInstance(){
        return Singlton3Holder.instance;
    }

}
