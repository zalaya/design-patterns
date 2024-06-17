package xyz.zalaya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarFactoryTest {

    @Test
    public void testCreateVehicle() {
        VehicleFactory factory = new CarFactory();
        Vehicle vehicle = factory.create();

        Assertions.assertEquals("Car", vehicle.getName());
    }

}
