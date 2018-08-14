package com.blumoc.backendfcolnoz.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

	private static final String COURSE_VARIABLE = "course";

	private static final String COURSES_VAL = "courses";

	public static final String COURSES_VIEW = COURSES_VAL;
	
	private static final Log LOG = LogFactory.getLog(CourseController.class);
	
	@Autowired
	@Qualifier("courseServiceImpl")
	private CourseService courseService; 
	
	
	public CourseController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/listcourses")
	public ModelAndView listAllCourses() {
		LOG.info("Call method listAllCourses()");
		ModelAndView mav = new ModelAndView(COURSES_VIEW);
		mav.addObject(COURSE_VARIABLE,new Course());
		mav.addObject(COURSES_VAL, courseService.listAllCourses());
		return mav;
	}
	
	@PostMapping("/addcourse")
	public String addCourse(@ModelAttribute(COURSE_VARIABLE) Course course) {
		LOG.info("Call method addCourse()" + "----"+ "PARAM :"+course.toString());
		courseService.addCourse(course);
		return "redirect:/courses/listcourses";
	}

}
