package com.example.demo.model;

public class CalculatorBean {
   private int num1;
   private int num2;
   private int result;
   private String data;
   private int port;
   
   public int getPort() {
	return port;
}

	/*
	 * public void setPort(int port) { this.port = port; }
	 */

	public int getNum1()
	  { return num1; } 
	  
	/*
	 * public void setNum1(int num1) { this.num1 = num1; } public int getNum2() {
	 * return num2; } public void
	 * 
	 * setNum2(int num2) { this.num2 = num2; }
	 */

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getData() {
		return data+" "+result;
	}

	public void setData(String data) {
		this.data = data;
	}
	 

   
}
