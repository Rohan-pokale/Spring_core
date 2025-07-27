package com.pathfinder;

import com.pathfinder.Controller.CourseController;
import com.pathfinder.Model.Course;
import com.pathfinder.Model.Course1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.cfg.xml");

        CourseController courseController=context.getBean("courseController",CourseController.class);
        Course course=context.getBean("course",Course.class);
        Course1 course1=context.getBean("course1",Course1.class);

        courseController.addCourse(course);
        courseController.updateCourse(course1);
        System.out.println( "Hello World!" );
    }
}
