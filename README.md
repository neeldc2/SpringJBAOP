# SpringJBAOP
Java Brains Spring AOP Concepts

After Advice Types that handles return values
Changes are in LoggingAspect and ShapeService class.

Output
Single Argument Advice is run
The return string is Hello World
The return object is Hello World
The return object is 10
The return excpetion is java.lang.RuntimeException: Custom Exception
Exception in thread "main" java.lang.RuntimeException: Custom Exception
	at com.aop.spring.service.ShapeService.printStrings(ShapeService.java:25)
	at com.aop.spring.service.ShapeService$$FastClassBySpringCGLIB$$55749175.invoke(<generated>)
	at org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:204)
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:717)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:157)
	at org.springframework.aop.aspectj.AspectJAfterThrowingAdvice.invoke(AspectJAfterThrowingAdvice.java:58)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:168)
	at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:92)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179)
	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:653)
	at com.aop.spring.service.ShapeService$$EnhancerBySpringCGLIB$$9edf5400.printStrings(<generated>)
	at com.aop.spring.Trial.main(Trial.java:18)


