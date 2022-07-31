package com.springrest.SpringRest.services;

import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Service;

import com.springrest.SpringRest.entities.Course;

@Service


public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"JavaCore","This course contain basis of Java"));
		list.add(new Course(156,"Springboot","This is Rest api"));
	
	
	@Override
	public List<Course> getCourses() {
	
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course:list) {
			if (course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return   c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

}
