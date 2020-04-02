package com.syntax.class19;

public class Cat extends Animals {
public String eyesColor;

public void purr() {
	System.out.println("Cats can purr");
}

public static void main(String[] args) {
	Cat cat=new Cat();
	cat.purr();
	cat.eyesColor="Blue, green";
	cat.fur="long";
	cat.sleep();
	System.out.println();
}
}
