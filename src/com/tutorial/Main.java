package com.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.spellChecker.spellCheckerModule;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//Prototype-Scope
		HelloWorld obj = (HelloWorld) context.getBean("helloworld");
		HelloWorld obj1 = (HelloWorld) context.getBean("helloworld");
		obj.setMessage("I´m a HEro");
		obj.getMessage();
		obj1.getMessage();
		System.out.println(obj.getNumber());
		System.out.println( obj1.getNumber() );
		
		System.out.println("Test Singleton vs Prototype:");
		//Singleton-Scope
		HelloWorld testSingleton = (HelloWorld) context.getBean("hellow");
		//setze neuen String
		testSingleton.setMessage("What so ever");
		testSingleton.getMessage();
		
		HelloWorld testSingleton2 = (HelloWorld) context.getBean("hellow");
		testSingleton2.getMessage();
		
		
		//Init Destroy
		HelloInitDestroy initTest = (HelloInitDestroy) context.getBean("initdestroy");
		
		System.out.println(initTest.getMessage());
		
		
		spellCheckerModule module1 = (spellCheckerModule) context.getBean("spellcheckerModule");
	}

}
