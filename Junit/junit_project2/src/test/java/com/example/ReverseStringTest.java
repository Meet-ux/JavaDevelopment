package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    void testMain() {
        ReverseString obj = new ReverseString();
        // String expected = "avaJ";

        assertEquals("avaJ", obj.reverse("Java"));

    }
}
 