package com.progrank.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
//1- we can put dependency by this way also
//@ComponentScan(basePackages = "com.progrank.annotation")
//@PropertySource("classpath:company-info")
public class ConfigClass {
	// we can put dependency by this way also
	@Bean
	public SoftwareEngineer engineer() {
		return new SoftwareEngineer ();
	}
	
	@Bean
	public Company company() {
		// this is for constructor function
		Company company = new Company(engineer());

		
//		This case for setters
//		Company company = new Company();
//		company.setEngineer(engineer());
		return company;
	}
	
}
