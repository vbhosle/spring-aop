package org.javabrains.koushik.service;

import org.javabrains.koushik.aspect.LoggingAspect;
import org.javabrains.koushik.model.Circle;

public class ShapeServiceProxy extends ShapeService{

	public Circle getCircle() {
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
