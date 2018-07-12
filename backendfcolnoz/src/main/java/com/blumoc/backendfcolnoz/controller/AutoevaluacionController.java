package com.blumoc.backendfcolnoz.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.blumoc.backendfcolnoz.service.AutoEvaluacionService;

@Controller
@RequestMapping("/autoEvaluacion")
public class AutoevaluacionController {
	
	@Autowired
	@Qualifier("autoevaluacionService")
	private AutoEvaluacionService autService;
	
	public static final String AUTOEVALUACION_VIEW = "autoEvaluacionView";
	public static Log LOG = LogFactory.getLog(AutoevaluacionController.class);
	
	@GetMapping("/metodoUno")
	public RedirectView getMetodoUno() {
		LOG.info("Metodo Uno Solo Redireccion");
		return new RedirectView("/autoEvaluacion/metodoDos");
	}
	
	@GetMapping("/metodoDos")
	public ModelAndView getMetodoDos() {
		ModelAndView mav = new ModelAndView(AUTOEVALUACION_VIEW);
		autService.getMessageService();
		mav.addObject("mensaje", "mensaje en el correo");
		return mav;
	}
	

}
