package xyz.zalaya.character.implementation.knight;

import xyz.zalaya.character.Character;
import xyz.zalaya.character.CharacterFactory;

public class KnightFactory extends CharacterFactory {
    @Override
    public Character create() {
        return new Knight();
    }
}
