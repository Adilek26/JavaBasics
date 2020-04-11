package com.syntax.class22;

public class Degree {
//	Create a class ‘Degree’ having a method ‘getPrerequisite’ that prints
//	“”To get a degree you need high school diploma”“. 
//	Class ‘Degree’ has 2 subclasses namely ‘Bachelors’ and Masters’.
//	In Masters class override method ‘getPrerequisite’.
//	Call the method by creating an object of each of the three classes.
	String sName;
	public Degree(String sName){
		this.sName=sName;
	}
	public void getPrerequisite() {
		System.out.println(sName+" To get a degree you need high school diploma");
	}
}
class Bachelors extends Degree{
	public Bachelors(String sName) {
		super(sName);
	}
	public void getPrerequisite() {
		System.out.println(sName+" To get a degree you need high school diploma");
	}
}
class Masters extends Degree{
	public Masters(String sName) {
		super(sName);
	}
	public void getPrerequisite() {
		System.out.println(sName+" To get a degree you need high school diploma");
	}
}
