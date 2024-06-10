package xyz.zalaya.kingdom.weapon;

import lombok.RequiredArgsConstructor;
import xyz.zalaya.kingdom.weapon.implementation.Staff;
import xyz.zalaya.kingdom.weapon.implementation.Sword;

import java.util.function.Supplier;

@RequiredArgsConstructor
public enum WeaponFactory {
    SWORD(Sword::new),
    STAFF(Staff::new);

    private final Supplier<Weapon> constructor;

    public Weapon create() {
        return constructor.get();
    }
}
