package xyz.zalaya.kingdom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class KingdomRegistryTest {
    @BeforeEach
    public void setUp() {
        KingdomRegistry.INSTANCE.getKingdoms().clear();
    }

    @Test
    @DisplayName("Test singleton instance")
    public void testSingletonInstance() {
        KingdomRegistry kingdomRegistry1 = KingdomRegistry.INSTANCE;
        KingdomRegistry kingdomRegistry2 = KingdomRegistry.INSTANCE;

        Assertions.assertEquals(kingdomRegistry1, kingdomRegistry2);
    }

    @Test
    @DisplayName("Test add")
    public void testAdd() {
        KingdomRegistry.INSTANCE.add(new Kingdom("Camelot", 1000, 100.0));

        Assertions.assertEquals(1, KingdomRegistry.INSTANCE.getKingdoms().size());
    }

    @Test
    @DisplayName("Test remove")
    public void testRemove() {
        Kingdom kingdom = new Kingdom("Camelot", 1000, 100.0);

        KingdomRegistry.INSTANCE.add(kingdom);
        KingdomRegistry.INSTANCE.remove(kingdom);

        Assertions.assertEquals(0, KingdomRegistry.INSTANCE.getKingdoms().size());
    }
}
