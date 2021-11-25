package com.spring.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HystixController {
	
	@Autowired
	private RestTemplate template;
	
	
	@Bean
	public RestTemplate getTemplate()
	{
		return new RestTemplate();
	}

	@GetMapping("/home")
	public String hyper()
	{
		return "<h1>Home for Hystix </h1>";
	}
	
	

	@HystrixCommand(fallbackMethod = "myfallBack")
	@GetMapping("/first")
	public String cart()
	{
		String order = template.getForObject("http://localhost:8081/order", String.class);
		String product = template.getForObject("http://localhost:8082/product", String.class);
		
		return order +"\n"+ product;
	}
	
	
	@GetMapping("/second")
	public String cart1()
	{
		String order = template.getForObject("http://localhost:8081/order", String.class);
		String product = template.getForObject("http://localhost:8082/product", String.class);
		
		return order +"\n"+ product;
	}
	
	public String myfallBack()
	{
	return "<h1>Hello User , Please Try After 10 minutes</h1>";
	}
	
	
}
