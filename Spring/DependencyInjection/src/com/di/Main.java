package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// Inversion of control means we will change the control of class object result by external outer resource object means own control is not present inside him
//One object depend on other object that is dependencies and method of injection of dependency by spring framework is called Dependency injection.
// Dependency Injection is the method of providing the dependencies and Inversion of Control is the end result of Dependency Injection
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Bike bike = ac.getBean("bike",Bike.class);
		bike.startEngine();
		bike.showColor();
//		Bike bike2 = ac.getBean("bike",Bike.class);
//		bike2.color = "Red";
		bike.color = "Red";
		bike.showColor();
		// So only one beans is generated even if we try to create new object
		
	}

}
