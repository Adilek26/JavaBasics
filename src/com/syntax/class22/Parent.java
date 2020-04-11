package com.syntax.class22;

public class Parent {
private void hello() {
	System.out.println("Hello from parent class");
}
}
class Child extends Parent{
	//we are not overriding, we just declaring /becs private
	private void hello() {
		System.out.println("Hello from child class");
	}
}