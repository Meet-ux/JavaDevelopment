package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    public void test(){
        ReverseString obj = new ReverseString();
        assertEquals("avaJ", obj.reverse("Java"));
        assertEquals("neilA", obj.reverse("lien"));
    }
}
