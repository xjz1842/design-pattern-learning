package bridge;

public class Client {

    public static void main(String[] args) {
        CarOnSpeedWay carOnSpeedWay = new CarOnSpeedWay();
        carOnSpeedWay.run();

        BusOnSpeedWay busOnSpeedWay = new BusOnSpeedWay();
        busOnSpeedWay.run();

        CarOnStreet carOnStreet = new CarOnStreet();
        carOnStreet.run();

        BusOnStreet busOnStreet = new BusOnStreet();
        busOnStreet.run();
    }
}
