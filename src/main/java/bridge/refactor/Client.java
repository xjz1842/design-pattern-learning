package bridge.refactor;

/**
 * @author xjz
 */
public class Client {

    public static void main(String[] args) {

        Car bigTruck = new BigTruck();
        Car smallCar = new SmallCar();

        AbstractRoad speedWay = new SpeedWay();
        speedWay.setCar(bigTruck);
        speedWay.run();
        speedWay.setCar(smallCar);
        speedWay.run();

        AbstractRoad street = new Street();
        street.setCar(bigTruck);
        street.run();
        street.setCar(smallCar);
        street.run();

        //test2
        Car  bigTruck1 = new BigTruck();
        People people = new Man();
        AbstractRoad abstractRoad = new Street();

        abstractRoad.setCar(bigTruck1);
        people.setAbstractRoad(abstractRoad);

        people.run();

    }
}
