package com.vc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vc.car.Car;

public class Main {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		
		   
		Car vc =  (Car) ctx.getBean("car");
		
		vc.run();
		

	}

}
