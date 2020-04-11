package com.syntax.class24;

public class phoneTest {
public static void main(String[] args) {
	//new Phone(); CE: cannot instanciate/create an objectof Phone class bcs itis ABSTRACT
	Phone iphone=new iPhone();
	iphone.call();
	iphone.text();
	iphone.takePicture();
	iphone.playMusic();
	
	
	Phone samsung=new Samsung();
	samsung.call();
	samsung.text();
	samsung.takePicture();
	samsung.playMusic();
}
}
