# SpringJBAOP
Java Brains Spring AOP Concepts

In this code, JointPoint functionality
Changes are in LoggingAspect and ShapeService class.

Output
Single Argument Advice is run
Single Argument Advice is run after returning
Double Argument Advice is run after exception
Exception in thread "main" java.lang.RuntimeException: Custom Exception
	at com.aop.spring.service.ShapeService.printStrings(ShapeService.java:25)
	at com.aop.spring.service.ShapeService$$FastClassBySpringCGLIB$$55749175.invoke(<generated>)
	at org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:204)
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:717)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:157)
	at org.springframework.aop.framework.adapter.AfterReturningAdviceInterceptor.invoke(AfterReturningAdviceInterceptor.java:52)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:168)
	at org.springframework.aop.aspectj.AspectJAfterThrowingAdvice.invoke(AspectJAfterThrowingAdvice.java:58)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:168)
	at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:92)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179)
	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:653)
	at com.aop.spring.service.ShapeService$$EnhancerBySpringCGLIB$$843c90b1.printStrings(<generated>)
	at com.aop.spring.Trial.main(Trial.java:15)



