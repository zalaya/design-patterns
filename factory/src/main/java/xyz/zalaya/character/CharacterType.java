package xyz.zalaya.character;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import xyz.zalaya.character.implementation.Archer;
import xyz.zalaya.character.implementation.Knight;
import xyz.zalaya.character.implementation.Wizard;

import java.util.function.Function;

@Getter
@RequiredArgsConstructor
public enum CharacterType {
    ARCHER(Archer::new),
    KNIGHT(Knight::new),
    WIZARD(Wizard::new);

    private final Function<CharacterAttributes, Character> constructor;

    public Character create(CharacterAttributes attributes) {
        return constructor.apply(attributes);
    }
}
