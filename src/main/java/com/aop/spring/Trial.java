package com.aop.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.spring.service.ShapeService;

public class Trial {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		shapeService.getCircle().setName("New Circle Name");
		shapeService.printStrings("a", "b");

	}

}
