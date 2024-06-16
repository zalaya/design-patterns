package xyz.zalaya.character;

import xyz.zalaya.character.implementation.Archer;
import xyz.zalaya.character.implementation.Knight;
import xyz.zalaya.character.implementation.Wizard;

public class CharacterFactory {
    public static Character create(CharacterType type) {
        return switch (type) {
            case KNIGHT -> new Knight();
            case ARCHER -> new Archer();
            case WIZARD -> new Wizard();
        };
    }
}
