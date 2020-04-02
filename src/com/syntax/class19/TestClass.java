package com.syntax.class19;

public class TestClass {
	public static void main(String[] args) {
		
	
Dog dog=new Dog();
//access variable from own class
dog.breed="Husky";
//access varablaes from parent clas
dog.color="Grey";
dog.fur="Too much";
dog.size="big";

//access method from own class
dog.bark();
//access methods from patenr class
dog.beWild();
dog.eat();
dog.sleep();
Dog.age=2;
Dog.display();
System.out.println("________________________");
Animals animal=new Animals();
//can acces only features define within itis class
animal.color="Any";
animal.size="Any";
animal.fur="Any";

animal.sleep();
animal.eat();
animal.beWild();
System.out.println("Animals can be "+animal.color+" color "+animal.size+" size "+animal.fur+" kind of fur");
;

	}

}
