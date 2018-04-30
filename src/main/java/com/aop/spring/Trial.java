package com.aop.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.spring.model.Triangle;
import com.aop.spring.service.ShapeService;

public class Trial {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		Triangle triangle = context.getBean("triangle", Triangle.class);
		System.out.println(triangle.getName());
		context.close();

	}

}
