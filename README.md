# SpringJBAOP
Java Brains Spring AOP Concepts

In this code, JointPoint functionality
Changes are only in LoggingAspect class.

Output
Single String Argument
Inside Third Advice : New Circle Name
execution(void com.aop.spring.model.Circle.setName(String))
Inside Advice : Circle Name
execution(String com.aop.spring.model.Circle.getName())
Inside Advice : New Circle Name
New Circle Name


