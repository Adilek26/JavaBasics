package com.syntax.class23;
//class SmartMachine{
//
//	public void smart() {
//		System.out.println("I am a smart machine");
//	}
//}

public class Computer {
//	Create a Class Computer that
//	will have 4 subclasses as Apple, Lenovo, HP, Dell. 
//
//	Define common behavior within and 
//	some fields in parent class and override some of the methods in child classes
//	Define some methods specific to child classes
//	Create objects of child classes and store them into array.
//	FLoop through each object and execute available methods.
	String brand;
	public Computer(String brand) {
		this.brand=brand;
	}
	public void connectInt() {
		System.out.println(brand+" computer connects internet");
	}
	public void keyBoard() {
		System.out.println(brand+"has a keyboard");
	}
}
class Apple extends Computer{
	public Apple(String brand) {
		super(brand);
	}
	public void connectInt() {
		System.out.println(brand+" computer connects internet quickly");
	}
	public void  apps() {
		System.out.println("Apple computer has own apps");
	}
}
class Lenovo extends Computer{
	public  Lenovo(String brand) {
		super(brand);
	}

public void connectInt() {
	System.out.println(brand+" computer connects internet easily");
}
public void  design() {
	System.out.println("Lenovo computer has new design");
}
}
class HP extends Computer{
	public  HP(String brand) {
		super(brand);
	}

public void connectInt() {
	System.out.println(brand+" computer connects internet easily");
}
public void  strong() {
	System.out.println("HP computer has strong mechanism");
}
}
class Dell extends Computer{
	public  Dell(String brand) {
		super(brand);
	}

public void connectInt() {
	System.out.println(brand+" computer connects internet easily");
}
public void  screen() {
	System.out.println("Dell computer has touchable screen");
}
}
