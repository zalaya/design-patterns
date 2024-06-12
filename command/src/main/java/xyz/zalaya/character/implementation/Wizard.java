package xyz.zalaya.character.implementation;

import xyz.zalaya.character.Character;

public class Wizard implements Character {
    @Override
    public void attack() {
        System.out.println("Wizard attacks");
    }

    @Override
    public void defend() {
        System.out.println("Wizard defends");
    }
}
