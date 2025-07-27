package com.pathfinder.Controller;

import com.pathfinder.Model.Course;
import com.pathfinder.Model.Course1;
import com.pathfinder.Service.CourseService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CourseController {

    CourseService courseService ;

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
