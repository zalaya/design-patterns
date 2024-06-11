package xyz.zalaya.kingdom.character.implementation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class KnightTest {
    @Test
    @DisplayName("Knight display")
    void testDisplay() {
        Knight knight = new Knight();
        knight.display();
    }
}
