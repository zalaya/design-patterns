package xyz.zalaya.character;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CharacterTypeTest {
    @Test
    @DisplayName("CharacterType enum values")
    public void testCharacterTypeValues() {
        CharacterType[] types = CharacterType.values();

        Assertions.assertEquals(3, types.length, "CharacterType should have 3 values");
        Assertions.assertArrayEquals(CharacterType.values(), types, "Values should be equal");
    }
}
