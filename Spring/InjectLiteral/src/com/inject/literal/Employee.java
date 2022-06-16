package com.inject.literal;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("${employee.name}")
	private String empName;
	
	@Value("${employee.id}")
	private int empId;
	
	@Value("${employee.skills}")
	private String empOtherSkills;
	
//	@Value("Ram") // By this way also we can insert literals value
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//	public void setEmpOtherSkills(String empOtherSkills) {
//		this.empOtherSkills = empOtherSkills;
//	}
	public void showDetails() {
		System.out.println("Employee Name Is = "+empName);
		System.out.println("Employee ID Is = "+ empId);
		System.out.println("Employee Other Skills Are ="+ empOtherSkills);
	}
}
