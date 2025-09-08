package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootIocProj02StrategyDpApplication {

    
	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootIocProj02StrategyDpApplication.class, args);
		//get  Target spring bean class obj ref
		Vehicle  vehicle=ctx.getBean("vehicle",Vehicle.class);
		vehicle.journey("hyd", "Goa");
		
		//close the IOC container
		 ((ConfigurableApplicationContext) ctx).close();
		
	}

}
