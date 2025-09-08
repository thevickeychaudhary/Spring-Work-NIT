package com.vc.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {
	@Autowired
	private DiscoveryClient client;

	public String getBillingInfo() {
		List<ServiceInstance> listSl = client.getInstances("Billing-Service");

		ServiceInstance Sl = listSl.get(0); // Manually we are picking up the instance ;

		String url = Sl.getUri() + "/billing/info";

		RestTemplate template = new RestTemplate();

		String resp = template.getForObject(url, String.class);
		return resp;
	}// method
}// class
