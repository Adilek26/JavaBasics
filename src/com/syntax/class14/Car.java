package com.syntax.class14;

public class Car {
//define feature of the car
	String make;
	String model;
	int year;
	String color;
	int speed;
	
	//define behavior
	//All the behaviors must be independent not nested
	
	void drive() {
		System.out.println(make+" Car can drive");
	}
	
	void accelerate() {
		System.out.println(make+" Car can accelerate");
	}
	void makeNoise() {
		System.out.println(make+" Car make noise");
	}
	
	void stop() {
		System.out.println(make+" Car stops when you push to break");
		System.out.println(make+" Car stops");
	}
}
