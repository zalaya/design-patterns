package xyz.zalaya.character.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.zalaya.character.Character;
import xyz.zalaya.character.CharacterAttributes;
import xyz.zalaya.character.CharacterType;
import xyz.zalaya.character.implementation.Archer;
import xyz.zalaya.character.implementation.Knight;
import xyz.zalaya.character.implementation.Wizard;

public class CharacterFactoryTest {
    @Test
    @DisplayName("Create archer instance")
    public void testCreateArcherInstance() {
        CharacterAttributes attributes = new CharacterAttributes("Legolas", 100, 50, 20);
        Character archer = CharacterFactory.create(CharacterType.ARCHER, attributes);

        Assertions.assertNotNull(archer, "Archer should not be null");
        Assertions.assertInstanceOf(Archer.class, archer, "Archer should be an instance of Archer");
    }

    @Test
    @DisplayName("Create knight instance")
    public void testCreateKnightInstance() {
        CharacterAttributes attributes = new CharacterAttributes("Gimli", 100, 50, 20);
        Character knight = CharacterFactory.create(CharacterType.KNIGHT, attributes);

        Assertions.assertNotNull(knight, "Knight should not be null");
        Assertions.assertInstanceOf(Knight.class, knight, "Knight should be an instance of Knight");
    }

    @Test
    @DisplayName("Create wizard instance")
    public void testCreateWizardInstance() {
        CharacterAttributes attributes = new CharacterAttributes("Gandalf", 100, 50, 20);
        Character wizard = CharacterFactory.create(CharacterType.WIZARD, attributes);

        Assertions.assertNotNull(wizard, "Wizard should not be null");
        Assertions.assertInstanceOf(Wizard.class, wizard, "Wizard should be an instance of Wizard");
    }
}
