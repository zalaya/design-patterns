package xyz.zalaya.character.implementation.wizard;

import xyz.zalaya.character.Character;
import xyz.zalaya.character.CharacterFactory;

public class WizardFactory extends CharacterFactory {
    @Override
    public Character create() {
        return new Wizard();
    }
}
