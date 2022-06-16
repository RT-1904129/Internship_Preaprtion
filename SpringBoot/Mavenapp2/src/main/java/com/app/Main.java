package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication


// Here all three annotation work as same which our first annotation is working
// so these three annotation same as above one annotation
//It enable spring boot automatic creation beans configuration
@EnableAutoConfiguration
// it is searching @Controller,@Component,@Restcontroller
// Enable component scanning for those classes which are annotated with
//above i mentioned in given module or submodule of it .
@ComponentScan
// This is similar to @configuration
@SpringBootConfiguration
public class Main {
	
	// Here dispature servlent only intilized when request is asked
	// it is not auto directed just after server start;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext cont = SpringApplication.run(Main.class,args);
 
	}
}
