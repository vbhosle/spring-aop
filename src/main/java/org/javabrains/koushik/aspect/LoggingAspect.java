package org.javabrains.koushik.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
		System.out.println("Before method with String argument called, arg:" + name);
	}
	
	@After("args(name)")
	public void stringArgumentMethodsAfter(String name) {
		System.out.println("After method with String argument called, arg:" + name);
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringArgumentMethodsAfterReturning(String name, String returnString) {
		System.out.println("After returning from method with String argument, arg:" + name + ", returned:"+returnString);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void stringArgumentMethodsAfterThrowing(String name, Exception ex) {
		System.out.println("After method with String argument throw exception, arg:" + name +", Exception:"+ ex);
	}
	
	@Around("@annotation(org.javabrains.koushik.aspect.Loggable)")
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		//actual method execution, so we can skip the execution!
		System.out.println("Around: Before");
		Object returnType = proceedingJoinPoint.proceed();
		System.out.println("Around: After");
		return returnType;
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	@Pointcut("within(org.javabrains.koushik.model.Circle)")
	public void allCircleMethods() {}
}
