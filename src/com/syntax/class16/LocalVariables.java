package com.syntax.class16;

public class LocalVariables {
void nameInside() {
	String name="John";//local variable that visible only wthin 
	//method it was declared
	System.out.println(name);
	
}
void anotherName() {
	String name="Jane";
}
public static void main(String[] args) {
	
	
	//System.out.println(name);CE:name won't be visible to another method
	//since ist scope only within name inside method
	LocalVariables obj=new LocalVariables ();
	obj.nameInside();
	
	boolean flag=true;
	if(flag) {
		String answer="Yes";
	}
//	System.out.println(answer);CE: scope of variable answer is not visible outside of 
	for(int i=0;i<=5; i++) {
		System.out.println(i);
	}
	for(int i=0;i<=5; i++) {
		System.out.println(i);
	}
	String name="Gulbahar";
}
}
