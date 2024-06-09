package factory.character.factory;

import factory.character.Character;
import factory.character.CharacterAttributes;
import factory.character.CharacterType;
import factory.character.implementation.Archer;
import factory.character.implementation.Knight;
import factory.character.implementation.Wizard;

public class CharacterFactory {
    public static Character create(CharacterType type, CharacterAttributes attributes) {
        return switch (type) {
            case ARCHER -> new Archer(attributes);
            case KNIGHT -> new Knight(attributes);
            case WIZARD -> new Wizard(attributes);
        };
    }
}
