package com.aop.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	// Use least possible option among before,after and around.
	// ProceedingJoinPoint parameter is mandatory
	// If the methods that around advice catches returns an Object, then
	// the around advice method also has to return an Object.
	@Around("@annotation(com.aop.spring.aspect.Loggable)")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnValue = null;
		try {
			System.out.println("Before Method executes");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Method returns");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		System.out.println("After finally");
		
		return returnValue;
	}
	
	/*@Before("allGetters()")	
	public void advice() {
		System.out.println("Advice");
	}*/
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
}
