package com.aop.spring.aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	//This will be called only for Circle class methods
	//So in the output, it is printed only once
	@Before("allGetters()")
	public void loggingAdvice() {
		System.out.println("Advice run. Get Method called.");
	}
	
	//This never gets called,
	//because at spring package level, the only
	//class available is Trial.java
	@Before("allGetters2()")
	public void secondAdvice() {
		System.out.println("Second Advice run.");
	}
	
	//This will be called twice since the
	//point cut refer to all the sub-packages as well.
	@Before("allGetters3()")
	public void thirdAdvice() {
		System.out.println("Third Advice run.");
	}
	
	//Applies to all methods of class Circle
	@Pointcut("within(com.aop.spring.model.Circle)")
	public void allGetters() {
		System.out.println("Main Advice");
	}
	
	//Applies to all classes at this package level
	@Pointcut("within(com.aop.spring.*)")
	public void allGetters2() {}
	
	//Applies to all classes at this package and also sub-package level
	@Pointcut("within(com.aop.spring..*)")
	public void allGetters3() {}

}
