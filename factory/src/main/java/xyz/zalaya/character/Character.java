package xyz.zalaya.character;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Character {
    protected final CharacterAttributes attributes;

    public abstract void attack();
    public abstract void defend();
}
