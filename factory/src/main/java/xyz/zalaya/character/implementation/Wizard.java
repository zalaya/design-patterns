package xyz.zalaya.character.implementation;

import xyz.zalaya.character.Character;
import xyz.zalaya.character.CharacterAttributes;

public class Wizard extends Character {
    public Wizard(CharacterAttributes attributes) {
        super(attributes);
    }

    @Override
    public void attack() {
        System.out.println("Wizard attacks");
    }

    @Override
    public void defend() {
        System.out.println("Wizard defends");
    }
}
