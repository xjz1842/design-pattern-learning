package factory;

public class BikeFactory implements ICarFactory{

    @Override
    public Car getCar() {
        return new Bike();
    }

}
