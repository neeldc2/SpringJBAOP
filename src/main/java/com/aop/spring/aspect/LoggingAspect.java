package com.aop.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import com.aop.spring.model.Circle;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters()")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.toString());
		Circle circle = (Circle) joinPoint.getTarget();
		System.out.println("Inside Advice : " + circle.getName());
	}
	
	//Advice for any method having a single parameter for type String.
	@Before("args(String)")
	public void advice2() {
		System.out.println("Single String Argument");
	}
	
	//Advice for any method having a single parameter for type String.
	@Before("args(name)")
	public void advice3(String name) {
		System.out.println("Inside Third Advice : " + name);
	}
	
	//Applies to all methods of class Circle
	@Pointcut("within(com.aop.spring.model.Circle)")
	public void allGetters() {
		System.out.println("Main Advice");
	}

}
