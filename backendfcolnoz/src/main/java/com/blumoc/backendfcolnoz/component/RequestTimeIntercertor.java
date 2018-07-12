package com.blumoc.backendfcolnoz.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component("requestTimeInterceptor")
public class RequestTimeIntercertor extends HandlerInterceptorAdapter{

	private static final String START_TIME = "startTime";
	private static final Log LOG  = LogFactory.getLog(RequestTimeIntercertor.class);
	
	//Se ejecuta antes de entrar en el metodos del controlador
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		request.setAttribute(START_TIME, System.currentTimeMillis());
		return true;
	}

	//se ejecuta antes de mostrar la vista en el navegador
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long startTime = (long)request.getAttribute(START_TIME);
		LOG.info("REQUEST URL: '"+ request.getRequestURL().toString()+"'"+(System.currentTimeMillis()- startTime)+ "'ms");
		LOG.info("IP ADDRESS: "+request.getRemoteAddr());
	}

	
	
}
