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

	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		//actual method execution, so we can skip the execution!
		System.out.println("Around: Before");
		Object returnType = proceedingJoinPoint.proceed();
		System.out.println("Around: After");
		return returnType;
	}
	
	public void loggingAdvice() {
		System.out.println("Logging from the advice");
	}
}
