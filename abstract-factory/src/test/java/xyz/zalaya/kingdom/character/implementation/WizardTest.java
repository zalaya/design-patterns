package xyz.zalaya.kingdom.character.implementation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WizardTest {
    @Test
    @DisplayName("Wizard display")
    void testDisplay() {
        Wizard wizard = new Wizard();
        wizard.display();
    }
}
