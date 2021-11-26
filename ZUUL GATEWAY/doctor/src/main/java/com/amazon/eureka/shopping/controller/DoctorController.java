package com.amazon.eureka.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

	@GetMapping("/doctor")
	public String doc()
	{
		return "<h1>All doctor Comes Here</h1>";
	}
}
