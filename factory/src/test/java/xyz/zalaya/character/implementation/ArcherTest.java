package xyz.zalaya.character.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.zalaya.character.CharacterAttributes;

public class ArcherTest {
    @Test
    @DisplayName("Archer creation with valid attributes")
    public void testCreateArcherWithValidAttributes() {
        CharacterAttributes attributes = new CharacterAttributes("Legolas", 100, 50, 20);
        Archer archer = new Archer(attributes);

        Assertions.assertNotNull(archer, "Archer should not be null");
        Assertions.assertEquals("Legolas", archer.getAttributes().getName(), "Archer name should be Legolas");
        Assertions.assertEquals(100, archer.getAttributes().getHealth(), "Archer health should be 100");
        Assertions.assertEquals(50, archer.getAttributes().getAttack(), "Archer attack should be 50");
        Assertions.assertEquals(20, archer.getAttributes().getDefense(), "Archer defense should be 20");
    }

    @Test
    @DisplayName("Archer attack")
    public void testArcherAttack() {
        CharacterAttributes attributes = new CharacterAttributes("Legolas", 100, 50, 20);
        Archer archer = new Archer(attributes);

        archer.attack();
    }

    @Test
    @DisplayName("Archer defend")
    public void testArcherDefend() {
        CharacterAttributes attributes = new CharacterAttributes("Legolas", 100, 50, 20);
        Archer archer = new Archer(attributes);

        archer.defend();
    }
}
