package factory.character.implementation;

import factory.character.Character;
import factory.character.CharacterAttributes;

public class Knight extends Character {
    public Knight(CharacterAttributes attributes) {
        super(attributes);
    }

    @Override
    public void attack() {
        System.out.println("Knight attacks!");
    }

    @Override
    public void defend() {
        System.out.println("Knight defends!");
    }
}
