package com.vc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vc.model.Customer;


@RestController
public class CustomerOperationController 
{

   
	@GetMapping("/report")
	public ResponseEntity<Customer> showData() {
	    Customer cust = new Customer(1011, "Navneet", 50000.0);
	    return new ResponseEntity<>(cust, HttpStatus.OK);
	}
    
}
