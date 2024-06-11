package xyz.zalaya.kingdom.weapon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.zalaya.kingdom.character.Character;
import xyz.zalaya.kingdom.character.CharacterFactory;

public class WeaponFactoryTest {
    @Test
    @DisplayName("Weapon factory test")
    void testCharacterFactorySword() {
        Weapon sword = WeaponFactory.SWORD.create();
        sword.display();
    }

    @Test
    @DisplayName("Weapon factory test")
    void testCharacterFactoryStaff() {
        Weapon staff = WeaponFactory.STAFF.create();
        staff.display();
    }
}
