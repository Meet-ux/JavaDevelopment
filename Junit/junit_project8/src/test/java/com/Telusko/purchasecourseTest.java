package com.Telusko;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.learning.Course;
import com.learning.javaCourse;



public class purchasecourseTest {
    
    @Test
    void testproceedWithCourse(){
        purchasecourse obj  = new purchasecourse();
        boolean status = obj.proceedWithCourse(new javaCourse());
        assertTrue(status);
    }
    @Test
    void testproceedWithCourse2(){
        purchasecourse obj  = new purchasecourse();
        boolean status = obj.proceedWithCourse(new javaCourse());
        assertFalse(status,"It is faield because of assert false");
    }
        
}