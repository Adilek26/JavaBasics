package com.syntax.class19;

public class ConstructorCall {
	public ConstructorCall() {
		
		System.out.println("I am non argument Constructur");
	}
	public ConstructorCall(String str) {
		this();
		System.out.println("Hello");
	}
	public ConstructorCall(String str,String str1) {
		this("hello");
		System.out.println("how are you");
	}
	public static void main(String[] args) {
		ConstructorCall obj=new ConstructorCall("Java","love");
	}

}
