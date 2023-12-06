import dev.arthurlunkes.math.MyMath;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Test MyMath")
public class MyMathTest {

    @Test
    @DisplayName("Test Add Method")
    public void testAdd() {
        assertEquals(2, MyMath.add(1, 1));
    }

    @Test
    @DisplayName("Test Subtract Method")
    public void testSubtract() {
        assertEquals(0, MyMath.subtract(1, 1));
    }

    @Test
    @DisplayName("Test Multiply Method")
    public void testMultiply() {
        assertEquals(1, MyMath.multiply(1, 1));
    }

    @Test
    @DisplayName("Test Divide Method")
    public void testDivide() {
        assertEquals(1, MyMath.divide(1, 1));
    }

    @Test
    @DisplayName("Test Divide Method")
    public void testDivide0() {
        assertThrows(ArithmeticException.class, () -> {
            MyMath.divide(0, 0);
        });
    }

    @Test
    @DisplayName("Test Modulo Method")
    public void testMod() {
        assertEquals(0, MyMath.mod(1, 1), "Modulo should be 0");
    }

    @Test
    @DisplayName("Test Power Method")
    public void testPow() {
        assertEquals(1, MyMath.pow(1, 1));
    }

    @Test
    @DisplayName("Test Square Root Method")
    public void testSqrt() {
        assertEquals(1, MyMath.sqrt(1));
    }

    @Test
    @DisplayName("Test Square error Root Method disabled")
    @Disabled
    public void testSqrtError() {
        assertEquals(0, MyMath.sqrt(1));
    }

}
