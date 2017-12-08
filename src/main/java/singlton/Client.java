package singlton;

public class Client {

    public static void main(String[] args) {
        Singlton singlt =  Singlton.getInstance();
        Singlton singlt1 =  Singlton.getInstance();
        System.out.println(singlt == singlt1);

        Singlton1 singlton1 =  Singlton1.getInstance();
        Singlton1 singlton11 =  Singlton1.getInstance();
        System.out.println(singlton1 == singlton11);

        Singlton2 singlton2 =  Singlton2.getInstance();
        Singlton2 singlton22 =  Singlton2.getInstance();
        System.out.println(singlton2 == singlton22);

        Singlton3 singlton3 = Singlton3.getInstance();
        Singlton3 singlton33 = Singlton3.getInstance();
        System.out.println(singlton3 == singlton33);

        Singlton4  singlton4 =  Singlton4.INSTANCE;
        Singlton4  singlton44 =  Singlton4.INSTANCE;
        System.out.println(singlton4==singlton44);
    }
}
