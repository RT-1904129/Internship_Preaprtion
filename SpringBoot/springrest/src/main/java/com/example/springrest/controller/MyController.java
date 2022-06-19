package com.example.springrest.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.entities.Course;
import com.example.springrest.services.CourseService;
import org.springframework.http.HttpStatus;

// rest full form is representational state transfer  
@RestController
public class MyController {
	@Autowired 
	private CourseService courseSerivice;
	
	@GetMapping("/home")
	public String home() {
		 return "welcome to course" ;
	}
	
	@GetMapping("/courses")
	public List<Course> getCourse(){
		return this.courseSerivice.getCourses();
	}
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseSerivice.getCourses(Long.parseLong(courseId));
	}
	
	// for getting reverse back to the given course and it is add in list also;
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course){
		return this.courseSerivice.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseSerivice.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus>deleteCourse(@PathVariable String courseId){
		try {
			this.courseSerivice.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
