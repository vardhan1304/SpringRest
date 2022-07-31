package com.springrest.SpringRest.services;

import java.util.List;

import com.springrest.SpringRest.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
 
	public Course addCourse(Course course);
	
}
