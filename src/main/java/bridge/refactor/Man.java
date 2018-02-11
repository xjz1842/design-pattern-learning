package bridge.refactor;

public class Man extends People{

    @Override
    public void run() {
        System.out.println("男人开着");
        abstractRoad.run();
    }

}
