package xyz.zalaya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    public void testDatabaseSingleton() {
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();

        Assertions.assertEquals(database1, database2);
        Assertions.assertEquals(database1.hashCode(), database2.hashCode());
        Assertions.assertEquals(database1.toString(), database2.toString());
    }

}
