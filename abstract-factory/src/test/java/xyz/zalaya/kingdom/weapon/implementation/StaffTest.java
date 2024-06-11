package xyz.zalaya.kingdom.weapon.implementation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StaffTest {
    @Test
    @DisplayName("Staff display")
    void testDisplay() {
        Staff staff = new Staff();
        staff.display();
    }
}
