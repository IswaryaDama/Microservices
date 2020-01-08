package com.example.demo.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.CalculatorBean;

// Proxy is helping us to communicate with another service and it contains a 
//method declaration which is returning an object to hold the data being returned from the microservice with which we are communicating


//@FeignClient(name="calculator-service",url="localhost:8000")
//@FeignClient(name="calculator-service")
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="calculator-service")
public interface CalculatorProxy {
   
	//@GetMapping("/calculatorapi/add/{num1}/{num2}")
	@GetMapping("/calculator-service/calculatorapi/add/{num1}/{num2}")
	public CalculatorBean calculate(@PathVariable int num1, @PathVariable int num2);
	
}
