package com.syntax.class19;

public class USA {
String state, capital;

public USA(String state, String capital) {
	this.state=state;
	this.capital=capital;
}
public void displayState() {
	System.out.println(state);
}
public void displayCapital() {
	System.out.println(capital);
}

//can I call a method insade another method?-->Yes
public void displayInfo() {
	this.displayState();
	displayState();//by default compilar add this keyword to a method
	displayCapital();
	
}
public static void main(String[] args) {
	USA state1=new USA("Texas","Austin");
	state1.displayState();
	state1.displayCapital();
	state1=new USA("Atlanta","Georgia");//reassinging
	state1.displayState();
	state1.displayCapital();
}
}
