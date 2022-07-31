package com.springrest.SpringRest.controller;


import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRest.entities.*;
import com.springrest.SpringRest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		
		return "WelCome to Courses Application Home page";
	}
	
	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
		
		
	}
	
	@GetMapping("/courses/{courseId}")
	public  Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping(path="/courses",consumes="application/json")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
		
	}
	
	
	
	
	
	
	
	
	

}
