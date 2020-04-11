package com.syntax.class25;

public interface Drivable {

	 boolean MOVE_FAST=true;
	//if we write boolean MOVE_FAST=true; 
	//compiler by default adds * public static final
	
	//compiler by default adds public abstract
	void drive();
}
abstract class Vehicles{
	abstract void stop();
}
class Cars extends Vehicles implements Drivable{

	@Override
	public void drive() {
		System.out.println("Car drives");
	}

	@Override
	void stop() {
		System.out.println("Car stops");
		
	}
	}