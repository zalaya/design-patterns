package xyz.zalaya.kingdom.weapon.implementation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SwordTest {
    @Test
    @DisplayName("Sword display")
    void testDisplay() {
        Sword sword = new Sword();
        sword.display();
    }
}
