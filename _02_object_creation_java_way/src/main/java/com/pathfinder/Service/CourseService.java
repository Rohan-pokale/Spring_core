package com.pathfinder.Service;

import com.pathfinder.Dao.CourseDao;
import com.pathfinder.Model.Course;
import com.pathfinder.Model.Course1;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CourseService {

    CourseDao courseDao;

    public void addCourse(Course course){
        courseDao.addCourse(course);
    }
    public void deleteCourse(Course course){
        courseDao.deleteCourse(course);
    }
    public void updateCourse(Course1 course1){
        courseDao.updateCourse(course1);
    }
    public Course getCourse(int id){
        return courseDao.getCourse(id);
    }
    public List<Course> getCourseList(){
        return courseDao.getCourseList();
    }
}
