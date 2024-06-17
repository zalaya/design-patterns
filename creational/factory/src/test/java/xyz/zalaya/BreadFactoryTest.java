package xyz.zalaya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BreadFactoryTest {

    @Test
    public void testCreateBaguette() {
        BreadFactory factory = new BreadFactory();
        Bread bread = factory.create(BreadType.BAGUETTE);

        Assertions.assertEquals("Baguette", bread.getName());
    }

    @Test
    public void testCreateBrioche() {
        BreadFactory factory = new BreadFactory();
        Bread bread = factory.create(BreadType.BRIOCHE);

        Assertions.assertEquals("Brioche", bread.getName());
    }

}
