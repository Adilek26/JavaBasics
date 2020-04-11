package com.syntax.class24;

public class VehicleTest {
public static void main(String[] args) {
	
	
//	new Vehicle("yellow");
//	new Car("Sedan","yellow");
	
	Vehicle tesla=new Tesla("yellow","Sedan","tesla");
	tesla.drive();
	tesla.stop();
	tesla.brake();
	tesla.start();
	//tesla.display();//Ce: method is not defined in vehicle
	
	
	new Toyota("red", "sedan", "toyota");
	new Toyota("blue", "sedan", "toyota");
	Toyota.total();
}
}
