package com.amazon.eureka.paymentProvider.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@RequestMapping("paynow/{price}")
	public String payNow(@PathVariable("price") int price)
	{
		return "payment with "+price+" is Successful";
	}
}
 