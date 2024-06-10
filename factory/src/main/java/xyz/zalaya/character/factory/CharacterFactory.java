package xyz.zalaya.character.factory;

import xyz.zalaya.character.Character;
import xyz.zalaya.character.CharacterAttributes;
import xyz.zalaya.character.CharacterType;

public class CharacterFactory {
    public static Character create(CharacterType type, CharacterAttributes attributes) {
        return type.create(attributes);
    }
}
