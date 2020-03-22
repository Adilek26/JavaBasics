package com.syntax.class14;

public class Dog {
String breed;
String color;
String name;
int age;



public static void main(String[] args) {
	Dog dog1=new Dog();
	dog1.breed="Shih tzu";
	dog1.color="brown";
	dog1.name="Charlie";
	dog1.age=3;
	
	
	Dog dog2=new Dog();
	dog2.breed="buuldog";
	dog2.color="black";
	dog2.name="Dock";
	dog2.age=5;
	//behav
	dog1.eat();
	dog1.bark();
	dog1.run();
	
	dog2.eat();
	dog2.bark();
	dog2.run();
}//for behavior
void eat() {
	System.out.println(name+" Dog can eat");
}
void bark() {
	System.out.println(name+" dog can bark");
}
void run() {
	System.out.println(name+" Dog can run");
}
}
