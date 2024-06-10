package xyz.zalaya.character;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class Character {
    protected final CharacterAttributes attributes;

    public abstract void attack();
    public abstract void defend();
}
