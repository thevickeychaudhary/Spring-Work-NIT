package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create IOC container
        FileSystemXmlApplicationContext ctx = 
                new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");

        // Get target Spring bean class object reference
        WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);

        // Invoke the business method
        String msg = generator.showWishMessage("raja");
        

        // Print the result
        System.out.println("Result: " + msg);
        
//        System.out.println(.getDate());
//        System.out.println(generator.getTime());
        // Close the IOC container
        ctx.close();
    }
}