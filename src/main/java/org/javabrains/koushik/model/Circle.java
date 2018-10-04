package org.javabrains.koushik.model;

public class Circle {
	private String name;

	public String getName() {
		System.out.println("In Circle:getName");
		return name;
	}

	public void setName(String name) {
		System.out.println("In Circle:setName");
		this.name = name;
	}
	
	public String setNameAndReturn(String name) {
		System.out.println("In Circle:setNameAndReturn");
		this.name = name;
		return this.name;
	}
}
