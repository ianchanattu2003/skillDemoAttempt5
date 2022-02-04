import static org.junit.Assert.*;
import org.junit.*;

public class DemoTest {
    @Test
    public void testmod() {
        skillDemo5 s5 = new skillDemo5();
        assertEquals(s5.modulus(5, 5), 1); // Should fail
    }
}
