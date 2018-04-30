package com.aop.spring.model;

public class Triangle {
	
	String name;

	public String getName() {
		System.out.println("Triangle get method called");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
