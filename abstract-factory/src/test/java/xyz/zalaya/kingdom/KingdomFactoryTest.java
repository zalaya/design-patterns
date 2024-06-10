package xyz.zalaya.kingdom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.zalaya.kingdom.character.Character;
import xyz.zalaya.kingdom.character.implementation.Knight;
import xyz.zalaya.kingdom.character.implementation.Wizard;
import xyz.zalaya.kingdom.weapon.Weapon;
import xyz.zalaya.kingdom.weapon.implementation.Staff;
import xyz.zalaya.kingdom.weapon.implementation.Sword;

public class KingdomFactoryTest {
    @Test
    @DisplayName("Test create knight character")
    void testCreateKnightCharacter() {
        Character knight = KingdomFactory.KNIGHT.createCharacter();

        Assertions.assertNotNull(knight);
        Assertions.assertInstanceOf(Knight.class, knight);
    }

    @Test
    @DisplayName("Test create wizard character")
    void testCreateWizardCharacter() {
        Character wizard = KingdomFactory.WIZARD.createCharacter();

        Assertions.assertNotNull(wizard);
        Assertions.assertInstanceOf(Wizard.class, wizard);
    }

    @Test
    @DisplayName("Test create sword weapon")
    void testCreateSwordWeapon() {
        Weapon sword = KingdomFactory.KNIGHT.createWeapon();

        Assertions.assertNotNull(sword);
        Assertions.assertInstanceOf(Sword.class, sword);
    }

    @Test
    @DisplayName("Test create staff weapon")
    void testCreateStaffWeapon() {
        Weapon staff = KingdomFactory.WIZARD.createWeapon();

        Assertions.assertNotNull(staff);
        Assertions.assertInstanceOf(Staff.class, staff);
    }
}
