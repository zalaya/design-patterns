package factory.character.implementation;

import factory.character.Character;
import factory.character.CharacterAttributes;

public class Archer extends Character {
    public Archer(CharacterAttributes attributes) {
        super(attributes);
    }

    @Override
    public void attack() {
        System.out.println("Archer attacks!");
    }

    @Override
    public void defend() {
        System.out.println("Archer defends!");
    }
}