package com.blumoc.backendfcolnoz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exampleGet")
public class ExampleGetController {
	
	private static final String NM_IN_MODEL = "nm_in_model";
	private static final String EXAMPLE_GET = "exampleGet";

	//localhost:8080/exampleGet/requestUno?nm=Fernando
	@GetMapping("/requestUno")
	public ModelAndView getRequestUno(@RequestParam(name="nm",required=false,defaultValue="Guest")String name) {
		ModelAndView modelAndView = new ModelAndView(EXAMPLE_GET);
		modelAndView.addObject(NM_IN_MODEL, name);
		return modelAndView;
		
	}
	
	//segunda manera de hacer Get 
	//localhost:8080/exampleGet/requestDos/Fernando
	@GetMapping("/requestDos/{nm}")
	public ModelAndView getRequestDos(@PathVariable("nm") String name) {
		ModelAndView modelAndView = new ModelAndView(EXAMPLE_GET);
		modelAndView.addObject("nm_in_model", name);
		return modelAndView;
	}
}
