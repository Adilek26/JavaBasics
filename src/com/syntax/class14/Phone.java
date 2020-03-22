package com.syntax.class14;

import java.util.Scanner;

public class Phone {
	String color;
	String model;
	String desing;
	
	void sound() {
		System.out.println(model+"The Phone have voice");
	}
	void connect() {
		System.out.println(model+"It connects to the internet");
	}
	void camera() {
		System.out.println(model+"It Takes pictures");
	}

	public static void main(String[] args) {
		//create an object from phone class
		//instanciate Phone class
		Phone s1=new Phone();
		s1.color="Pink";
		s1.model="IPhone";
		s1.desing="8Plus";
		
		Phone s2=new Phone();
		s2.color="Black";
		s2.model="Samsong";
		s2.desing="Galaxy7";
		
		Phone s3=new Phone();
		s3.color="Golden";
		s3.model="Nokia";
		s3.desing="5plus";
		
		
		s1.sound();
		s1.connect();
		s1.camera();
		
		s2.sound();
		s2.connect();
		s2.camera();
		
		s3.sound();
		s3.connect();
		s3.camera();
		
		String str="Hello friends";//String class
		str=str.replace("Hello","Welcome");
		System.out.println(str);//methods
		Scanner scan=new Scanner(System.in);//Scanner class
		scan.hasNextLine();//methods
		
		
	}

}
