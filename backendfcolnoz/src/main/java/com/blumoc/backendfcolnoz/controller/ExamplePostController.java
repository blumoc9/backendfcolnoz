package com.blumoc.backendfcolnoz.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.blumoc.backendfcolnoz.component.ExampleComponent;
import com.blumoc.backendfcolnoz.model.Person;

@RequestMapping("/examplePost")
@Controller
public class ExamplePostController {

	public static final String FORM_VIEW ="form";
	public static final String RESULT_PAGE="examplePostResult";
	
	@Autowired //indica a spring que se va a inyectar un componente que se encuentra en memoria
	@Qualifier("exampleComponent") // indica el nombre del bean que está en su memoria
	private ExampleComponent ec;
	
	@GetMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("person", new Person());
		ec.sayHello();
		return FORM_VIEW;
	}
	
	@PostMapping("/addPerson")
	public ModelAndView addPerson(@Valid @ModelAttribute("person") Person person,BindingResult bindingResult) {
		
		ModelAndView modelAndView = new ModelAndView();
		if(bindingResult.hasErrors()) {
			modelAndView.setViewName(FORM_VIEW);
		}else {
			modelAndView.addObject("person",person);
			modelAndView.setViewName(RESULT_PAGE);
		}
		
		return modelAndView;
	}
	
	//forma de redireccionar
	@GetMapping("/")
	public RedirectView redirect() {
		return new RedirectView("/examplePost/showForm");
	}
}
