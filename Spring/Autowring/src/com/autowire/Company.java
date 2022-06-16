package com.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	@Autowired
	@Qualifier("dept2")
	// dept 2 beans is injected . 
	// it don't required any setter or constructor to set its value 
	Dept dept;
	
	
	
//	@Autowired 
//	// now injecting through constrotor
//	public Company(HRDept dept) {
//		this.dept = dept;
//	}
//	public void setObject(HRDept dept) {
//		this.dept = dept;
//	}
	public void companyWork() {
		if(dept == null) {
			System.out.println("No Client No work");
		}
		else
			dept.work();
	}
}
