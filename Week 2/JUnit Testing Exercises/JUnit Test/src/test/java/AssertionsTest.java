import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals("Sum should be 5", 5, 2 + 3);
        assertTrue("5 should be greater than 3", 5 > 3);
        assertFalse("5 is not less than 3", 5 < 3);
        Object obj = null;
        assertNull("Object should be null", obj);
        Object obj2 = new Object();
        assertNotNull("Object should not be null", obj2);
    }
}
