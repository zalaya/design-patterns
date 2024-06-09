package xyz.zalaya.character.factory;

import xyz.zalaya.character.Character;
import xyz.zalaya.character.CharacterAttributes;
import xyz.zalaya.character.CharacterType;
import xyz.zalaya.character.implementation.Archer;
import xyz.zalaya.character.implementation.Knight;
import xyz.zalaya.character.implementation.Wizard;

public class CharacterFactory {
    public static Character create(CharacterType type, CharacterAttributes attributes) {
        return switch (type) {
            case ARCHER -> new Archer(attributes);
            case KNIGHT -> new Knight(attributes);
            case WIZARD -> new Wizard(attributes);
        };
    }
}
