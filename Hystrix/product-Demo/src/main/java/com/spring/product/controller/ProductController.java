package com.spring.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/product-home")
	public String home()
	{
		return "<h1>Product Page For Order Service</h1>";
	}
	
	@GetMapping("/product")
	public String product()
	{
		return "<h1>Product Page For Order Service</h1>";
	}
}
