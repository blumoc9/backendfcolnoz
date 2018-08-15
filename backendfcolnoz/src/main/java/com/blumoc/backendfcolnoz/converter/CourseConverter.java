package com.blumoc.backendfcolnoz.converter;

import org.springframework.stereotype.Component;

import com.blumoc.backendfcolnoz.entity.Course;
import com.blumoc.backendfcolnoz.model.CourseModel;

/**
 * 
 * @author fcolnoz9
 *
 */
@Component("courseConverter")
public class CourseConverter {
	
	
	//entity---> to  model
	public CourseModel entity2model(Course course) {
		
		CourseModel courseModel = new CourseModel();
		courseModel.setDescription(course.getDescription());
		courseModel.setName(course.getName());
		courseModel.setHours(course.getHours());
		courseModel.setPrice(course.getPrice());
		return courseModel;
	}
	
	//model---->entity
	public Course model2entity(CourseModel courseModel) {
		Course course = new Course();
		course.setDescription(courseModel.getDescription());
		course.setHours(courseModel.getHours());
		course.setName(courseModel.getName());
		course.setPrice(courseModel.getPrice());
		return course;
	}
	public CourseConverter() {
		// TODO Auto-generated constructor stub
	}

}
