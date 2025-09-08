package com.vc.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vc.client.BillingServiceRestConsumer;

@RestController
@RequestMapping("/shopping")
public class CartMsController
{
    @Autowired
	private BillingServiceRestConsumer client;
    
    @GetMapping("/details")
    public ResponseEntity<String> showBillingDetails()
    {
//    	ResponseEntity<String> entity = client.getBillingInfo();
//    	String resultBody = entity.getBody();
    	String resultBody = client.getBillingInfo();
    	
    	String billInfo = "Bill amount::"+new Random().nextInt(100000);
    	
    	return new ResponseEntity<String>(billInfo+"..."+resultBody,HttpStatus.OK);
    }
}
