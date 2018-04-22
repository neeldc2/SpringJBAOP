package com.aop.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	
	@After("args(name)")
	public void loggingAdvice(String name) {
		System.out.println("Single Argument Advice is run");
	}
	
	// After successful return, this advice is invoked
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void loggingAdvice2(String name, String returnString) {
		System.out.println("The return string is " + returnString);
	}
	
	// Object catches every return type
	@AfterReturning(pointcut="args(name)", returning="returnObject")
	public void loggingAdvice3(Object name, Object returnObject) {
		System.out.println("The return object is " + returnObject.toString());
	}
	
	// similarly, exceptions can also be caught
	@AfterThrowing(pointcut="args(name, names)", throwing="ex")
	public void loggingAdvice4(Object name, Object names, RuntimeException ex) {
		System.out.println("The return excpetion is " + ex.toString());
	}
	
}
