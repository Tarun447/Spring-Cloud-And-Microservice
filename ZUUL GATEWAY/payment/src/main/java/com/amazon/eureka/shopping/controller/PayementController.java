package com.amazon.eureka.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayementController {


	@GetMapping("/payment")
	public String pay()
	{
		return "<h1>Payment Page Here</h1>";
	}
}
