package com.example.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.springrest.entities.Course;

// because it provide services thats why we call it
@Service
public class CourseServicsimpl implements CourseService{
	List<Course>list;
	
	public CourseServicsimpl() {
		list = new ArrayList <>();
		list.add(new Course(145,"Java Core Course","this course canhelp you to much"));
		list.add(new Course(4343,"spring boot Course","this course can not help you to much"));
	}
	
	@Override
	public List<Course> getCourses(){
		
		return list;
	}
	
	@Override
	public Course getCourses(long courseId) {
		Course c = null;
		for(Course course:list) {
			if(course.getId()== courseId) {
				c = course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	
	@Override
	public Course updateCourse(Course course) {
		list.forEach(e -> {
			if(e.getId()== course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}
	@Override
	public void deleteCourse(long parseLong) {
		list = this.list.stream().filter(e->e.getId()!= parseLong).collect(Collectors.toList());
	}
}
