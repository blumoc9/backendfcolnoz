package com.blumoc.backendfcolnoz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/exampleError")
@Controller
public class ExampleErrorController {

	public static final String EXAMPLE_ERROR_VIEW = "404";
	
	@GetMapping("/errorView")
	public ModelAndView getErrorView() {
		ModelAndView modelAndView = new ModelAndView(EXAMPLE_ERROR_VIEW);
		return modelAndView;
	}
	
}
