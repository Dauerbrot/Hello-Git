package com.tutorial;

public class HelloInitDestroy {
	private String message;
	private float value;
	
	public void init(){
		message = "newWorld";
		value = 12.303434f;
	}
	
	public void destroy(){}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
	
	
	public void changeValueToStandard(){
		this.value = 123123.34f;
	}
	
}
