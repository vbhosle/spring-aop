package org.javabrains.koushik.model;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String setNameAndReturn(String name) {
		this.name = name;
		return this.name;
	}
}
