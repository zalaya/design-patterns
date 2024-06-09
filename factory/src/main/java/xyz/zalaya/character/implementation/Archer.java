package xyz.zalaya.character.implementation;

import xyz.zalaya.character.Character;
import xyz.zalaya.character.CharacterAttributes;

public class Archer extends Character {
    public Archer(CharacterAttributes attributes) {
        super(attributes);
    }

    @Override
    public void attack() {
        System.out.println("Archer attacks");
    }

    @Override
    public void defend() {
        System.out.println("Archer defends");
    }
}
