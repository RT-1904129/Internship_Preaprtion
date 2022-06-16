package com.progrank.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(ConfigClass.class);//new ClassPathXmlApplicationContext("bean.xml");
		Company  company = context.getBean("company",Company.class);
		company.showInfo();
		company.engineer.devlopment();
	}

}