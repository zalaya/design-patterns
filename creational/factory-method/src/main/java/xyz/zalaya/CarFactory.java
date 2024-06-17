package xyz.zalaya;

public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle create() {
        return new Car();
    }

}
