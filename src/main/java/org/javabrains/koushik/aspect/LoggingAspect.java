package org.javabrains.koushik.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("execution(public String org.javabrains.koushik.model.Triangle.getName())")
	public void loggingAdvice() {
		System.out.println("Advice run. getName method called");
	}
	
	@Before("allCircleMethods()")
	public void wildcardAdvice() {
		System.out.println("Wildcard advice run. Get method called");
	}
	
	@Pointcut("execution(public * org.javabrains.koushik.model.Circle.get*())")
	public void allGetters() {}
	
	@Pointcut("within(org.javabrains.koushik.model.Circle)")
	public void allCircleMethods() {}
}
