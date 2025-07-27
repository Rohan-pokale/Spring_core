package com.pathfinder.Controller;

import com.pathfinder.Model.Course;
import com.pathfinder.Model.Course1;
import com.pathfinder.Service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseController {

//    @Autowired //Field injection
    CourseService courseService ;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }  // Constructor injection

    public void addCourse(Course course){
        courseService.addCourse(course);
    }
    public void deleteCourse(Course course){
        courseService.deleteCourse(course);
    }
    public void updateCourse(Course1 course1){
        courseService.updateCourse(course1);
    }
    public Course getCourse(int id){
        return courseService.getCourse(id);
    }
    public List<Course> getCourseList(){
        return courseService.getCourseList();
    }
}
