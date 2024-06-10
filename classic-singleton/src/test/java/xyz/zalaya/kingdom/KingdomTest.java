package xyz.zalaya.kingdom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.zalaya.Kingdom;

public class KingdomTest {
    @Test
    @DisplayName("Test create kingdom")
    public void testCreateKingdom() {
        Kingdom kingdom = new Kingdom("Camelot", 1000, 100.0);

        Assertions.assertEquals("Camelot", kingdom.getName());
        Assertions.assertEquals(1000, kingdom.getPopulation());
        Assertions.assertEquals(100.0, kingdom.getArea());
    }
}
