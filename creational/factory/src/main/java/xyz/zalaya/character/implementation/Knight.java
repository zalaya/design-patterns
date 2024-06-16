package xyz.zalaya.character.implementation;

import xyz.zalaya.character.Character;

public class Knight implements Character {
    @Override
    public void attack() {
        System.out.println("Knight attacks!");
    }

    @Override
    public void defend() {
        System.out.println("Knight defends!");
    }
}
