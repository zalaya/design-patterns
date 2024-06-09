package xyz.zalaya.character.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.zalaya.character.CharacterAttributes;

public class WizardTest {
    @Test
    @DisplayName("Wizard creation with valid attributes")
    public void testCreateWizardWithValidAttributes() {
        CharacterAttributes attributes = new CharacterAttributes("Gandalf", 100, 50, 20);
        Wizard wizard = new Wizard(attributes);

        Assertions.assertNotNull(wizard, "Wizard should not be null");
        Assertions.assertEquals("Gandalf", wizard.getAttributes().getName(), "Wizard name should be Gandalf");
        Assertions.assertEquals(100, wizard.getAttributes().getHealth(), "Wizard health should be 100");
        Assertions.assertEquals(50, wizard.getAttributes().getAttack(), "Wizard attack should be 50");
        Assertions.assertEquals(20, wizard.getAttributes().getDefense(), "Wizard defense should be 20");
    }
}
