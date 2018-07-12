package com.blumoc.backendfcolnoz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.blumoc.backendfcolnoz.model.Person;
import com.blumoc.backendfcolnoz.service.ExampleService;

@Controller
@RequestMapping("/example")
public class ExampleController {

	private static final String EXAMPLE_VIEW_LIST = "exampleViewList";
	private static final String EXAMPLE_VIEW = "exampleView";
	
	@Autowired
	@Qualifier("exampleService")
	private ExampleService service;

	//primera Forma de llamar a las views
	@GetMapping("/viewString")
	public String getView(Model model) {
		model.addAttribute("person", new Person("Fernando",31));
		return EXAMPLE_VIEW;
	}
	
	//segunda forma de llamar a los views
	@GetMapping("/viewMAV")
	public ModelAndView getModelAndView() {
		ModelAndView modelAndView = new ModelAndView(EXAMPLE_VIEW);
		modelAndView.addObject("person", new Person("Geraldine", 29));
		return modelAndView;
		
	}
	
	//Llamar a la lista de Personas
	@GetMapping("/viewList")
	public ModelAndView getListPeople() {
		ModelAndView modelAndView  = new ModelAndView(EXAMPLE_VIEW_LIST);
		modelAndView.addObject("people",service.getPeople());
		return modelAndView;
	}
	

}
