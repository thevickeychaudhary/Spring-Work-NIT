package com.vc.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message-api") // global Path
public class MessageRenderController {
	@GetMapping("/wish")
	public ResponseEntity<String> showMessage() {
		// get system Date and time
		LocalDateTime idt = LocalDateTime.now();

		// Generate Wish Message
		String msg = null;
		int hour = idt.getHour();
		if (hour < 12)
			msg = "Good Morning";
		else if (hour < 16)
			msg = "Good Afternoon::";
		else if (hour < 20)
			msg = "Good evening::";
		else
			msg = "Good night::";
		
		// Create and return Response Entity object having response content nad status code
		ResponseEntity<String> entity = new ResponseEntity<String>(msg,HttpStatus.OK); // (Body,Status)
		return entity;
	}
}
