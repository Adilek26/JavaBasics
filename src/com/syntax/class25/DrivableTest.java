package com.syntax.class25;

public class DrivableTest {
public static void main(String[] args) {
	Drivable obj=new Cars();
	//Drivable.MOVE_FAST=false;
	obj.drive();
	//obj.stop();it's from Vehicles class
	
	Vehicles obj1=new Cars();
	obj1.stop();
	Cars obj2=new Cars();
	obj2.drive();
	obj2.stop();
}
}
