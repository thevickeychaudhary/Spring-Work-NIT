package com.vc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vc.model.Customer;



@Controller
public class HomeController 
{
    
	@GetMapping("/")
	public String showHome()
	{
		return "welcome";
	}
	@GetMapping("/customer")
	public String showCustomer(Model model)
	{
		Customer cust = new Customer();
		cust.setId(101);
		cust.setName("Vicky");
		cust.setBill(8500.56f);
		model.addAttribute("cust", cust);
		return "customer";
	}
}
