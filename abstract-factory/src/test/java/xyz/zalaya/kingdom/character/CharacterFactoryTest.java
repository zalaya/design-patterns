package xyz.zalaya.kingdom.character;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CharacterFactoryTest {
    @Test
    @DisplayName("Character factory test")
    void testCharacterFactoryKnight() {
        Character knight = CharacterFactory.KNIGHT.create();
        knight.display();
    }

    @Test
    @DisplayName("Character factory test")
    void testCharacterFactoryWizard() {
        Character wizard = CharacterFactory.WIZARD.create();
        wizard.display();
    }
}
