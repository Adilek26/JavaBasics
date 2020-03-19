package com.syntax.class09;

public class HW02 {
public static void main(String[] args) {
	//Create an array of names and store all names of your group. 
	//Then print your name from that array. 
	//(use 2 different ways of creating an array).
	String[]names=new String[6];
	names[0]="Arzu";
	names[1]="Azra";
	names[2]="Adile";
	names[3]="Julia";
	names[4]="Patyshgul";
	names[5]="Selbinyyaz";
	System.out.println(names[2]);
	
	
	String [] names1= { "Selbinyyaz", "Patyshgul", "Julia"," Adile",
			" Azra"," Arzu"};
	System.out.println(names1[3]);
}
}
