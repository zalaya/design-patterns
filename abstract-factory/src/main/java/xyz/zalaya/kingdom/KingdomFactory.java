package xyz.zalaya.kingdom;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import xyz.zalaya.kingdom.character.Character;
import xyz.zalaya.kingdom.character.CharacterFactory;
import xyz.zalaya.kingdom.weapon.Weapon;
import xyz.zalaya.kingdom.weapon.WeaponFactory;

@Getter
@RequiredArgsConstructor
public enum KingdomFactory {
    KNIGHT(CharacterFactory.KNIGHT, WeaponFactory.SWORD),
    WIZARD(CharacterFactory.WIZARD, WeaponFactory.STAFF);

    private final CharacterFactory characterFactory;
    private final WeaponFactory weaponFactory;

    public Character createCharacter() {
        return characterFactory.create();
    }

    public Weapon createWeapon() {
        return weaponFactory.create();
    }
}
