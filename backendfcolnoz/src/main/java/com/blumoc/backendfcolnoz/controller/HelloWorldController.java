package com.blumoc.backendfcolnoz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author fcolmenarezoronoz9@gmail.com
 * primeros pasos con spring boot
 * 
 */
@Controller
@RequestMapping("/say")
public class HelloWorldController {

	@GetMapping("/helloworld")
	public String  helloWorld() {
		return "helloWorld" ;
	}
	
}
