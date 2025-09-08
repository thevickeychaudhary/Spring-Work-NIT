package com.vc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingServiceController
{
 
   @GetMapping("/info")
   public String getBillingInfo()
   {
	   return "we can accept card payment , upi payment ,netBanking Payment,COD";
   }
}
