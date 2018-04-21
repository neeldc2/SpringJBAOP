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
	
	@AfterReturning("args(name)")
	public void loggingAdvice2(String name) {
		System.out.println("Single Argument Advice is run after returning");
	}
	
	@AfterReturning("args(name, names)")
	public void loggingAdvice3(String name, String names) {
		System.out.println("Double Argument Advice is run after successful return");
	}
	
	@AfterThrowing("args(name, names)")
	public void loggingAdvice4(String name, String names) {
		System.out.println("Double Argument Advice is run after exception");
	}
	
}
