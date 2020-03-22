package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		//build individual objects
		Car car1=new Car();
		car1.make="Lamborgini";
		car1.model="Gallardo";
		car1.year=2020;
		car1.color="Blue";
		
		
		Car car2=new Car();
		car2.make="BWM";
		car2.model="m5";
		car2.year=2019;
		car2.color="Pink";
		
		Car car3=new Car();
		car3.make="123";
		car3.speed=200;
		
		//print BMW
		System.out.println(car1.make);
		
		//i drive pink Bmw
		System.out.println("I drive "+car2.color+" "+car2.make);
				//accesing behevior methods
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();
		
		
		car2.drive();
		car2.stop();
		car2.makeNoise();
		car2.accelerate();
		//car2.break(); -->cannot method is not defined in car class
		
		System.out.println("I drive "+car2.color+" "+car2.make);
		
		Cars2 anotherCar=new Cars2();
		anotherCar.make="Toyota";
		anotherCar.speed=90;
		anotherCar.drive();
		
		//create a bike object
		//new Bike();-->cannot create
		//car2.breaking();CE:method is not defined in car class
		//I drive pink BMW
	}

}
