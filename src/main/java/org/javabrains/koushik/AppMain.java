package org.javabrains.koushik;

import org.javabrains.koushik.service.FactoryService;
import org.javabrains.koushik.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		FactoryService factoryService = new FactoryService();
		 ShapeService shapeService =  (ShapeService)factoryService.getBean("shapeService");
		 shapeService.getCircle();
	}

}
