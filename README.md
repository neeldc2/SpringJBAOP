# SpringJBAOP
Java Brains Spring AOP Concepts

In this code, multiple pointcuts are added.
Changes are only in LoggingAspect class.

Output
Third Advice run.
Advice run. Get Method called.
Third Advice run.
Circle Name

AND condition can also be used with Pointcuts
For instance
@Before("allGetters() && allGetters3()")

