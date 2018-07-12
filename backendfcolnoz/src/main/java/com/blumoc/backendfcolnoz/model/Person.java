package com.blumoc.backendfcolnoz.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author fcolnoz9 fcolmenarezoronoz9@gmail.com
 *
 */
public class Person {
	
	@NotNull
	@Size(min=1,max=10)
	private String name;
	
	@NotNull
	@Min(20)
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
		
	}
	
}
