package xyz.zalaya.character;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CharacterAttributesTest {
    @Test
    @DisplayName("CharacterAttributes creation with valid attributes")
    public void testCreateCharacterAttributesWithValidAttributes() {
        CharacterAttributes attributes = new CharacterAttributes("Gandalf", 100, 50, 20);

        Assertions.assertNotNull(attributes, "CharacterAttributes should not be null");
        Assertions.assertEquals("Gandalf", attributes.getName(), "CharacterAttributes name should be Gandalf");
        Assertions.assertEquals(100, attributes.getHealth(), "CharacterAttributes health should be 100");
        Assertions.assertEquals(50, attributes.getAttack(), "CharacterAttributes attack should be 50");
        Assertions.assertEquals(20, attributes.getDefense(), "CharacterAttributes defense should be 20");
    }

    @Test
    @DisplayName("CharacterAttributes getters and setters")
    public void testCharacterAttributesGettersAndSetters() {
        CharacterAttributes attributes = new CharacterAttributes("Gandalf", 100, 50, 20);

        attributes.setName("Saruman");
        attributes.setHealth(200);
        attributes.setAttack(100);
        attributes.setDefense(40);

        Assertions.assertEquals("Saruman", attributes.getName(), "CharacterAttributes name should be Saruman");
        Assertions.assertEquals(200, attributes.getHealth(), "CharacterAttributes health should be 200");
        Assertions.assertEquals(100, attributes.getAttack(), "CharacterAttributes attack should be 100");
        Assertions.assertEquals(40, attributes.getDefense(), "CharacterAttributes defense should be 40");
    }
}
