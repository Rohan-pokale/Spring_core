package com.pathfinder.Model;

import com.pathfinder.Controller.CourseController;
import com.pathfinder.Dao.CourseDao;
import com.pathfinder.Service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//this class is replace xml file xonfiguration
@Configuration
@ComponentScan(basePackages = {"com.pathfinder"})
public class SpringConfig {

    @Bean(name = "course")
    public Course getCourseBean() {
        return new Course(1, "Java", "Java Course", "1000");
    }

    @Bean(name = "course1")
    public Course1 getCourse1Bean() {
        return new Course1(1, "Java", "Java Course", "1000");
    }

    @Bean(name = "courseDao")
    public CourseDao getCourseDao() {
        return new CourseDao();
    }

    @Bean(name = "courseService")
    public CourseService getCourseService() {
        return new CourseService(getCourseDao());
    }

    @Bean(name = "courseController")
    public CourseController getCourseController() {
        return new CourseController(getCourseService());
    }




}
