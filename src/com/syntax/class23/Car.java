package com.syntax.class23;

public class Car {
String make;
public Car(String make) {
	this.make=make;
}
public void display() {
	System.out.println("I have "+make);
}
public void start() {
	System.out.println(make+" starts by turning key");
}
}
class BMW extends Car{
	
	public BMW(String make) {
		super(make);
}
	public void start() {
		System.out.println(make+" starts by pshing button");
	}
}
class Mersedes extends Car {
	public Mersedes(String make) {
		super(make);
	}
	public void start() {
		System.out.println(make+" starts remotely");
	}
	public void prettyLights() {
		System.out.println(make+" has pretty lights");
	}
}
class Tesla extends Car {
	public Tesla(String make) {
		super(make);
	}
	public void start() {
		System.out.println(make+" starts voice commend");
	}
	public void elektrical() {
		System.out.println("Drives with electricity");
	}
}
