package xyz.zalaya;

public class BikeFactory extends VehicleFactory {

    @Override
    public Vehicle create() {
        return new Bike();
    }

}
