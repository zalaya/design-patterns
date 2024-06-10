package xyz.zalaya.kingdom.character;

import lombok.RequiredArgsConstructor;
import xyz.zalaya.kingdom.character.implementation.Knight;
import xyz.zalaya.kingdom.character.implementation.Wizard;

import java.util.function.Supplier;

@RequiredArgsConstructor
public enum CharacterFactory {
    KNIGHT(Knight::new),
    WIZARD(Wizard::new);

    private final Supplier<Character> constructor;

    public Character create() {
        return constructor.get();
    }
}
