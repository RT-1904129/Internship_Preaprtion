package com.testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class keys{
	public void run(Engine key) {
		key.start();
	}
}
public class Main {

	public static void main(String[] args) {
	
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Engine key = ac.getBean("engine",Engine.class);
		new keys().run(key);

	}

}
