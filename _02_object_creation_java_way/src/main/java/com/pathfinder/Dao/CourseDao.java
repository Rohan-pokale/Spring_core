package com.pathfinder.Dao;

import com.pathfinder.Model.Course;
import com.pathfinder.Model.Course1;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CourseDao {
    public void addCourse(Course course){
        System.out.println(course);
        System.out.println("Course Added Successfully: ");
    }
    public void deleteCourse(Course course){
        System.out.println("Course Deleted Successfully: ");
    }
    public void updateCourse(Course1 course1){
        System.out.println(course1);
        System.out.println("Course Updated Successfully: ");
    }
    public Course getCourse(int id){
        System.out.println("Course Retrieved Successfully: ");
        return null;
    }
    public List<Course> getCourseList(){
        System.out.println("Course List Retrieved Successfully: ");
        return null;
    }
}
