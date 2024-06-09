package xyz.zalaya.character.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.zalaya.character.CharacterAttributes;

public class KnightTest {
    @Test
    @DisplayName("Knight creation with valid attributes")
    public void testCreateKnightWithValidAttributes() {
        CharacterAttributes attributes = new CharacterAttributes("Gimli", 100, 50, 20);
        Knight knight = new Knight(attributes);

        Assertions.assertNotNull(knight, "Knight should not be null");
        Assertions.assertEquals("Gimli", knight.getAttributes().getName(), "Knight name should be Gimli");
        Assertions.assertEquals(100, knight.getAttributes().getHealth(), "Knight health should be 100");
        Assertions.assertEquals(50, knight.getAttributes().getAttack(), "Knight attack should be 50");
        Assertions.assertEquals(20, knight.getAttributes().getDefense(), "Knight defense should be 20");
    }

    @Test
    @DisplayName("Knight attack")
    public void testKnightAttack() {
        CharacterAttributes attributes = new CharacterAttributes("Gimli", 100, 50, 20);
        Knight knight = new Knight(attributes);

        knight.attack();
    }

    @Test
    @DisplayName("Knight defend")
    public void testKnightDefend() {
        CharacterAttributes attributes = new CharacterAttributes("Gimli", 100, 50, 20);
        Knight knight = new Knight(attributes);

        knight.defend();
    }
}
