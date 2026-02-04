package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * Unit test for simple App.
 */
 @TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ShapeTest {

    ShapeTest (){
        System.out.println("Test Object is created constructor invokrf");
    }
    @BeforeAll
    void BeforeAll(){
        System.out.println("Before All Test  Starts");
    }
    @AfterAll
    void AfterAll(){
        System.out.println("After All Test  Ends");
    }
    Shapes shape;
    @BeforeEach
    void init(){
        shape = new Shapes();
        System.out.println("Before Test");
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void TestSquareArea() {
        assertEquals(576, shape.computeSquareArea(24));
        System.out.println("Actual Test Running");
    }
    @Test
    public void TestCircleArea() {
        Shapes shape = new Shapes();
        assertEquals(78.5, shape.computeCircleArea(5),"Area of circle has mistake");
        System.out.println("Actual Test Running");
    }
    @Test
    public void TestCircleNotArea() {
        Shapes shape = new Shapes();
        assertNotEquals(74.5, shape.computeCircleArea(5),"Area of circle has mistake");
    }
    @Test
    public void TestCircleNotArea_WithMessage() {
        Shapes shape = new Shapes();
        assertNotEquals(76.5, shape.computeCircleArea(5),"Area of circle expected and result same test failed");
    }

    //Supplier is just effficinet way to passs message in terms of time 
    @Test
    public void TestCircleArea_Supplier() {
        Shapes shape = new Shapes();
        assertEquals(78.5, shape.computeCircleArea(5),()->"Area of circle has mistake");
    }
    @AfterEach
    void destroy(){
        System.out.println("After Each Clean Up");
    }
}
