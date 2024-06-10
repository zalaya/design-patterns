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

    @Test
    @DisplayName("CharacterType creates correct Archer instance")
    public void testCharacterTypeCreatesArcher() {
        CharacterAttributes attributes = new CharacterAttributes("Legolas", 100, 50, 20);
        Character archer = CharacterType.ARCHER.create(attributes);

        Assertions.assertNotNull(archer, "Archer should not be null");
        Assertions.assertEquals("Legolas", archer.getAttributes().getName(), "Archer name should be Legolas");
        Assertions.assertEquals(100, archer.getAttributes().getHealth(), "Archer health should be 100");
        Assertions.assertEquals(50, archer.getAttributes().getAttack(), "Archer attack should be 50");
        Assertions.assertEquals(20, archer.getAttributes().getDefense(), "Archer defense should be 20");
    }

    @Test
    @DisplayName("CharacterType creates correct Knight instance")
    public void testCharacterTypeCreatesKnight() {
        CharacterAttributes attributes = new CharacterAttributes("Gimli", 100, 50, 20);
        Character knight = CharacterType.KNIGHT.create(attributes);

        Assertions.assertNotNull(knight, "Knight should not be null");
        Assertions.assertEquals("Gimli", knight.getAttributes().getName(), "Knight name should be Gimli");
        Assertions.assertEquals(100, knight.getAttributes().getHealth(), "Knight health should be 100");
        Assertions.assertEquals(50, knight.getAttributes().getAttack(), "Knight attack should be 50");
        Assertions.assertEquals(20, knight.getAttributes().getDefense(), "Knight defense should be 20");
    }

    @Test
    @DisplayName("CharacterType creates correct Wizard instance")
    public void testCharacterTypeCreatesWizard() {
        CharacterAttributes attributes = new CharacterAttributes("Gandalf", 100, 50, 20);
        Character wizard = CharacterType.WIZARD.create(attributes);

        Assertions.assertNotNull(wizard, "Wizard should not be null");
        Assertions.assertEquals("Gandalf", wizard.getAttributes().getName(), "Wizard name should be Gandalf");
        Assertions.assertEquals(100, wizard.getAttributes().getHealth(), "Wizard health should be 100");
        Assertions.assertEquals(50, wizard.getAttributes().getAttack(), "Wizard attack should be 50");
        Assertions.assertEquals(20, wizard.getAttributes().getDefense(), "Wizard defense should be 20");
    }
}
