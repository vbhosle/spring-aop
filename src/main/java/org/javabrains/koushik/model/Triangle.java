package org.javabrains.koushik.model;

public class Triangle {
	private String name;

	public String getName() {
		System.out.println("In Triangle:getName");
		return name;
	}

	public void setName(String name) {
		System.out.println("In Triangle:setName");
		this.name = name;
	}
}
