package xyz.zalaya.character.implementation;

import xyz.zalaya.character.Character;

public class Archer implements Character {
    @Override
    public void attack() {
        System.out.println("Archer attacks!");
    }

    @Override
    public void defend() {
        System.out.println("Archer defends!");
    }
}
