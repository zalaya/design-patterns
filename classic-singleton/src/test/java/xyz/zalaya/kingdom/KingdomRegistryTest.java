package xyz.zalaya.kingdom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.zalaya.Kingdom;
import xyz.zalaya.KingdomRegistry;

public class KingdomRegistryTest {
    @BeforeEach
    public void setUp() {
        KingdomRegistry.getInstance().getKingdoms().clear();
    }

    @Test
    @DisplayName("Test singleton instance")
    public void testSingletonInstance() {
        KingdomRegistry kingdomRegistry1 = KingdomRegistry.getInstance();
        KingdomRegistry kingdomRegistry2 = KingdomRegistry.getInstance();

        Assertions.assertEquals(kingdomRegistry1, kingdomRegistry2);
    }

    @Test
    @DisplayName("Test add")
    public void testAdd() {
        KingdomRegistry.getInstance().add(new xyz.zalaya.Kingdom("Camelot", 1000, 100.0));

        Assertions.assertEquals(1, KingdomRegistry.getInstance().getKingdoms().size());
    }

    @Test
    @DisplayName("Test remove")
    public void testRemove() {
        xyz.zalaya.Kingdom kingdom = new Kingdom("Camelot", 1000, 100.0);

        KingdomRegistry.getInstance().add(kingdom);
        KingdomRegistry.getInstance().remove(kingdom);

        Assertions.assertEquals(0, KingdomRegistry.getInstance().getKingdoms().size());
    }
}
