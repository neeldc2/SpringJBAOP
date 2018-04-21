package com.aop.spring.aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	
	// Bean of this class has to be created in spring.xml
	// While creating a bean, bean id isn't required because 
	// this bean is used only for initialisation and 
	// is not being referenced anywhere else in the application.

	// each method of this class is an "advice".
	// advice is a standard name used in AOP.
	@Before("execution(public String getName())")
	public void loggingAdvice() {
		System.out.println("Advice run. Get Method called.");
	}

}
