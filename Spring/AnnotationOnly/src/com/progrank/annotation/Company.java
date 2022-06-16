package com.progrank.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
//	@Value("${company.name}")
//	String companyName;
	
//	@Autowired
//	@Qualifier("softwareEngineer")
//	Engineer engineer ;
	
	SoftwareEngineer engineer ;
	public Company(SoftwareEngineer engineer) {
		this.engineer = engineer;
	}
	public void setEngineer(SoftwareEngineer engineer) {
		this.engineer = engineer;
	}
	public void showInfo() {
		System.out.println("hello details !!");
	}  
}
