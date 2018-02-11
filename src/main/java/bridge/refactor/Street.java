package bridge.refactor;

public class Street extends AbstractRoad{

    @Override
    public void run() {
        car.run();
        System.out.println("在市区街道上");
    }

}
