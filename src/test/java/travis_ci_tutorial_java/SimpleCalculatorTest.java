package travis_ci_tutorial_java;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {

    @Test
    public void testAdd() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(2, calc.add(1, 1));
    }

    @Test
    public void testMinus() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(2, calc.minus(5, 3));
    }

    @Test
    public void testMultiply() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(15, calc.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(2.5, calc.divide(5, 2), 0.0001);
    }
}
