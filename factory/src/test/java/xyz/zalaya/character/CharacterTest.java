package xyz.zalaya.character;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

public class CharacterTest {
    @Test
    @DisplayName("Character class is abstract")
    public void testCharacterIsAbstract() {
        Assertions.assertTrue(Modifier.isAbstract(Character.class.getModifiers()), "Character should be abstract");
    }
}
