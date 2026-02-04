package com.meet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class calcTest {

    @Test
    void testDividePositive() {
        calc c = new calc();
        assertEquals(2, c.divide(4, 2));
    }

    @Test
    void testDivideNegative() {
        calc c = new calc();
        assertEquals(-2, c.divide(4, -2));
    }

    @Test
    void testDivideZeroNumerator() {
        calc c = new calc();
        assertEquals(0, c.divide(0, 5));
    }

    @Test
    void testIntegerTruncation() {
        calc c = new calc();
        assertEquals(2, c.divide(5, 2));
    }

    @Test
    void testDivideByZeroThrows() {
        calc c = new calc();
        assertThrows(ArithmeticException.class, () -> c.divide(5, 0));
    }
}
