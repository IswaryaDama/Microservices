package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Calculator;

@RestController
public class CalculatorServiceController {

	@Autowired
	private Calculator calculator;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("calculatorapi/add/{num1}/{num2}")
	public Calculator addNumber(@PathVariable int num1, @PathVariable int num2)
	{
		calculator.setNum1(num1);
		calculator.setNum2(num2);
		calculator.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return calculator;
	}
	
}
