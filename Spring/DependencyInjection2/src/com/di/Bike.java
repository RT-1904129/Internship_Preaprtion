package com.di;

public class Bike {
	String color;
////	public void setColor(String color) {
////		this.color = color;
////	}
	Engine engine;
//	public Bike(String color){
//		this.color = color;
//		System.out.println("I am Constructor !!");
//	} 
	public Bike(Engine engine) {
		this.engine = engine;
		System.out.println("I am Constructor !!");
	}
	public void showColor() {
		System.out.println("Your Color is = "+ color);
	}
	public void startEngine() {
		if(engine == null) {
			System.out.println("Unable start your engine !!");
		}
		else
			engine.start();
	}
}
