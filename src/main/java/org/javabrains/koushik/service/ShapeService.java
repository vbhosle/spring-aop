package org.javabrains.koushik.service;

import org.javabrains.koushik.aspect.Loggable;
import org.javabrains.koushik.model.Circle;
import org.javabrains.koushik.model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;
	public Circle getCircle() {
		System.out.println("In ShapeService:getCircle");
		return circle;
	}
	public void setCircle(Circle circle) {
		System.out.println("In ShapeService:setCircle");
		this.circle = circle;
	}
	
	@Loggable
	public Triangle getTriangle() {
		System.out.println("In ShapeService:getTriangle");
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		System.out.println("In ShapeService:setTriangle");
		this.triangle = triangle;
	}
	
	
}
