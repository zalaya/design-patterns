package xyz.zalaya.character.implementation.archer;

import xyz.zalaya.character.Character;
import xyz.zalaya.character.CharacterFactory;

public class ArcherFactory extends CharacterFactory {
    @Override
    public Character create() {
        return new Archer();
    }
}
