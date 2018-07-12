package com.blumoc.backendfcolnoz.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.blumoc.backendfcolnoz.model.Person;
import com.blumoc.backendfcolnoz.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

	private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);
	
	@Override
	public List<Person> getPeople() {
		List<Person> people =  new ArrayList<Person>();
		people.add(new Person("Pacheco", 30));
		people.add(new Person("Pedro", 31));
		people.add(new Person("Porfirio", 33));
		people.add(new Person("Mariana", 26));
		people.add(new Person("Mariana", 29));
		people.add(new Person("Fernando", 31));
		LOG.info("Example Service getPeople");
		return people;
	}

}
