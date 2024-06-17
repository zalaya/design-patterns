package xyz.zalaya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BikeFactoryTest {

    @Test
    public void testCreateVehicle() {
        VehicleFactory factory = new BikeFactory();
        Vehicle vehicle = factory.create();

        Assertions.assertEquals("Bike", vehicle.getName());
    }

}
