package com.tutorial.spellChecker;

public class ObjectHolder {
	private int tag;
	private Intiiater variable;
	
	public ObjectHolder(int tag, Intiiater test){
		System.out.println("here is the Object Holder Const");
		this.tag = tag;
		variable = test;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public void getVariable() {
		variable.spellCheck();
		//return variable;
	}

	public void setVariable(Intiiater variable) {
		this.variable = variable;
	}
	
	
}
