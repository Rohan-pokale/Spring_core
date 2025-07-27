package com.pathfinder;

import com.pathfinder.Controller.CourseController;
import com.pathfinder.Model.Course;
import com.pathfinder.Model.Course1;
import com.pathfinder.Model.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;


public class App2
{
    public static void main( String[] args )
    {
       // ApplicationContext context =new ClassPathXmlApplicationContext("spring.cfg.xml");

        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);

        Environment environment= context.getEnvironment();
        System.out.println(environment.getProperty("id1"));
        System.out.println(environment.getProperty("courseName1"));
        System.out.println(environment.getProperty("courseDescription1"));
        System.out.println(environment.getProperty("coursePrice1"));
    }
}
