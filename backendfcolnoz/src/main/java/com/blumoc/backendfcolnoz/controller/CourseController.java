package com.blumoc.backendfcolnoz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.blumoc.backendfcolnoz.entity.Course;
import com.blumoc.backendfcolnoz.service.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {

	private static final String COURSES_VAL = "courses";

	public static final String COURSES_VIEW = COURSES_VAL;
	
	@Autowired
	@Qualifier("courseServiceImpl")
	private CourseService courseService; 
	
	
	public CourseController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/listcourses")
	public ModelAndView listAllCourses() {
		ModelAndView mav = new ModelAndView(COURSES_VIEW);
		mav.addObject(COURSES_VAL, courseService.listAllCourses());
		return mav;
	}
	
	@PostMapping("/addcourse")
	public String addCourse(@ModelAttribute("course") Course course) {
		courseService.addCourse(course);
		return "redirect:/courses/addcourse";
	}

}
