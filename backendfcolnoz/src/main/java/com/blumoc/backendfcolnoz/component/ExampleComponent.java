package com.blumoc.backendfcolnoz.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("exampleComponent") //hara que spring lo guarde en memoria cuando inicie la app
public class ExampleComponent {

	private static final Log LOG= LogFactory.getLog(ExampleComponent.class);
	
	public void sayHello() {
		LOG.info("HELLO FROM COMPONENT SPRING");
	}
}
