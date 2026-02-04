package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    ReverseString obj = new ReverseString();
    @Test
    public void testStringOneWord(){
        assertEquals("avaJ", obj.reverse("Java"));
        assertEquals("neilA", obj.reverse("Alien"));
    }
    @Test
    public void testStringMultiWord(){
        
        assertEquals("ysae si avaJ", obj.reverse("Java is easy"));
        assertEquals("neilA", obj.reverse("Alien"));
    }
}
