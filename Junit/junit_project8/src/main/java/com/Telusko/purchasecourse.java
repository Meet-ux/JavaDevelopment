package com.Telusko;

import com.learning.Course;

public class purchasecourse {
    private Course course;
    public boolean proceedWithCourse(Course course){
        return course.CoursePurchased();
    }
    
}
