package com.syntax.class17;

public class StaticKeyword {
	// create a templet for a phone
	String color;
	int memory;

	static String brand;
	static boolean touchScreen;

	// return type, name, parameters
  static void displayGeneralInfo() {
		System.out.println("We are building " + brand + " with touch screen = " + touchScreen);
	}

	void displaySpesifications() {
		System.out.println("We build phone with " + memory + " GB memory in " + color + " color");
	}

	public static void main(String[] args) {
		brand = "IPhone";
		touchScreen = true;
       //accesing instance variables
		StaticKeyword obj = new StaticKeyword();

		obj.color = "grey";
		obj.memory = 64;
		
		//accesing static method a static way
		displayGeneralInfo();
		//accesing static method a non static way/ throuh instance
		obj.displayGeneralInfo();//not preferable
		obj.displaySpesifications();
	}

}
