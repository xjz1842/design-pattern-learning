package factory;

public class TestFactory {


    public static void main(String[] args) {
        ICarFactory factory = null;
        // bike
        factory = new BikeFactory();
        Car bike = factory.getCar();
        bike.gotowork();

        // bus
        factory = new BusFactory();
        Car bus = factory.getCar();
        bus.gotowork();
    }
}
