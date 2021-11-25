package com.spring.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/order-home")
	public String home()
	{
		return "<h1>Home Page For Order Service</h1>";
	}
	
	@GetMapping("/order")
	public String order()
	{
		return "<h1>Order Page For Order Service</h1>";
	}
}
