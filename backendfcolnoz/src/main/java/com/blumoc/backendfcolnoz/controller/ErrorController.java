package com.blumoc.backendfcolnoz.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//Spring detecta que cuando exista un error de tipo 4xx -5xx se viene por este controlador
//ojo con la annotacion @ControllerAdvice
@ControllerAdvice
public class ErrorController {

	public static final String INTERNAL_SERVER_ERROR_VIEW= "/error/500";
	
	@ExceptionHandler(Exception.class)
	public String getInternalServerError() {
		return INTERNAL_SERVER_ERROR_VIEW;
	}
}
