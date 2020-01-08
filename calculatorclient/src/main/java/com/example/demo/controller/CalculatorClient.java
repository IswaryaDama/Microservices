package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CalculatorBean;
import com.example.demo.proxy.CalculatorProxy;

@RestController
public class CalculatorClient {

	@Autowired
	private CalculatorProxy proxy;
	
	@GetMapping("/calculator-client-feign/add/{num1}/{num2}/{data}")
	public CalculatorBean calculate(@PathVariable Integer num1, @PathVariable Integer num2, @PathVariable String data)
	{
		CalculatorBean calculator=proxy.calculate(num1, num2);
		data+="From the client the string added";
		calculator.setData(data);
		return calculator;
		
	}
	
	
}
