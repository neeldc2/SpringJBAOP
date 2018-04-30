package com.aop.spring.model;

import com.aop.spring.aspect.Loggable;

public class Triangle {
	
	String name;

	@Loggable
	public String getName() {
		System.out.println("Triangle get method called");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
