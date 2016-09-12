package com.tutorial.spellChecker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class spellCheckerModule {
	public spellCheckerModule(){
		System.out.println("SpellcheckerModule init");
		ApplicationContext contextSpellChecker = new ClassPathXmlApplicationContext("BeanSpellChecker.xml");
		System.out.println("Bean loaded");
	}
}
