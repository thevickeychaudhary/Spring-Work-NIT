package com.vc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer") // GLOBAL PATH
public class CustomerOperationController {

	@GetMapping("/report") // READ AND SELECTING OPERATION
	public ResponseEntity<String> showCustomerReport() {
		return new ResponseEntity<String>("From GET-ShowReport Method", HttpStatus.OK);
	}

	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer()
	{
		return new ResponseEntity<String>("From Post- RegisterCustomer Method",HttpStatus.OK);
	}
	
	@PutMapping("/modify")
	public ResponseEntity<String> updateCustomer()
	{
		return new ResponseEntity<String>("From PUT-UpdateCustomer() mwthod",HttpStatus.OK);
	}
	
	@PatchMapping("/pmodify")
	public ResponseEntity<String> updateCustomerByNo()
	{
		return new ResponseEntity<String>("From Path-UpdateCustomerByNo() mwthod",HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer()
	{
		return new ResponseEntity<String>("From Delete-Customer() mwthod",HttpStatus.OK);
	}
	

}
