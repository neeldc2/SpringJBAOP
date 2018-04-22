package com.aop.spring.service;

import com.aop.spring.model.Circle;
import com.aop.spring.model.Triangle;

public class ShapeService {
	
	private Triangle triangle;
	private Circle circle;
	
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public void printStrings(String name, String names) {
		throw new RuntimeException("Custom Exception");
		//throw(new RuntimeException());
	}
	
	public String returnArgs(String arg) {
		return arg;
	}
	
	public Integer returnInt(Integer integer) {
		return integer;
	}
	
}
