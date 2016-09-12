package com.tutorial;

public class HelloWorld {
	private String message;
	private int number;
	
	public int getNumber() {
		System.out.println("Number:"+number);
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setMessage(String message){
		this.message = message;
	}
	
	public void getMessage(){
		System.out.println("Your Message:" + message);
	}
	
}
