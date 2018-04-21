package com.aop.spring.aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters()")
	public void loggingAdvice() {
		System.out.println("Advice run. Get Method called.");
	}
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice run.");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {
		System.out.println("Main Advice");
	}

}
