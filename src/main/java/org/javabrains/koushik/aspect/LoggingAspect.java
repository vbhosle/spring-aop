package org.javabrains.koushik.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.toString());
	}
	
	@Before("args(name)")
	public void stringArgumentMethods(String name) {
		System.out.println("Method with String argument called, arg:" + name);
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	@Pointcut("within(org.javabrains.koushik.model.Circle)")
	public void allCircleMethods() {}
}
