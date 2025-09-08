package com.vc.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("Billing-Service") // here target service id
public interface IBillingServiceConsumer
{
    @GetMapping("/billing/api/info")
	public String fetchBillDetails();
}
