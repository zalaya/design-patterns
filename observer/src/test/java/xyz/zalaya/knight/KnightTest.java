package xyz.zalaya.knight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class KnightTest {
    @Test
    @DisplayName("Test create knight")
    public void testCreateKnight() {
        Knight knight = new Knight("Arthur");

        Assertions.assertEquals("Arthur", knight.getName());
        Assertions.assertInstanceOf(Adventurer.class, knight);
    }

    @Test
    @DisplayName("Test update")
    public void testUpdate() {
        Knight knight = new Knight("Arthur");

        knight.update();
    }

    @Test
    @DisplayName("Test set name")
    public void testSetName() {
        Knight knight = new Knight("Arthur");

        knight.setName("Lancelot");

        Assertions.assertEquals("Lancelot", knight.getName());
    }

    @Test
    @DisplayName("Test set name to null")
    public void testSetNameToNull() {
        Knight knight = new Knight("Arthur");

        knight.setName(null);

        Assertions.assertNull(knight.getName());
    }

    @Test
    @DisplayName("Test set name to empty")
    public void testSetNameToEmpty() {
        Knight knight = new Knight("Arthur");

        knight.setName("");

        Assertions.assertEquals("", knight.getName());
    }

    @Test
    @DisplayName("Test set name to whitespace")
    public void testSetNameToWhitespace() {
        Knight knight = new Knight("Arthur");

        knight.setName(" ");

        Assertions.assertEquals(" ", knight.getName());
    }

    @Test
    @DisplayName("Test set name to multiple whitespace")
    public void testSetNameToMultipleWhitespace() {
        Knight knight = new Knight("Arthur");

        knight.setName("   ");

        Assertions.assertEquals("   ", knight.getName());
    }

    @Test
    @DisplayName("Test set name to non-empty")
    public void testSetNameToNonEmpty() {
        Knight knight = new Knight("Arthur");

        knight.setName("Lancelot");

        Assertions.assertEquals("Lancelot", knight.getName());
    }

    @Test
    @DisplayName("Test set name to non-empty after setting to null")
    public void testSetNameToNonEmptyAfterSettingToNull() {
        Knight knight = new Knight("Arthur");

        knight.setName(null);
        knight.setName("Lancelot");

        Assertions.assertEquals("Lancelot", knight.getName());
    }

    @Test
    @DisplayName("Test set name to non-empty after setting to empty")
    public void testSetNameToNonEmptyAfterSettingToEmpty() {
        Knight knight = new Knight("Arthur");

        knight.setName("");
        knight.setName("Lancelot");

        Assertions.assertEquals("Lancelot", knight.getName());
    }
}
