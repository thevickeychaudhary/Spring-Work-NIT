package com.vc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vc.client.IBillingServiceConsumer;

@RestController
@RequestMapping("/shopping/api")
public class CartMsController
{
    @Autowired
	private IBillingServiceConsumer consumer;
    
    @GetMapping("/details")
    public String showShoppingDetails()
    {
        
    	 System.out.println("Shopping Controller :: client comp class name ::"+consumer.getClass());
     
    	
     return "Diwali Shopping for family : "+consumer.fetchBillDetails();
    }
}
