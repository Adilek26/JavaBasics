package com.syntax.class10;

public class RetriveElements {
public static void main(String[] args) {
	char[] grades= {'A','B','C', 'D','E','F'};
	//getting all elements
	for(int i=0; i<grades.length; i++) {
		System.out.print(grades[i]+" ");
	}
	System.out.println();
	System.out.println("---Printing advanced for loop---");
	
	for(char grade:grades) {
		System.out.print(grade+" ");
	}System.out.println();
	//create an arrayof fruits and retrive all elements
	String[] fruits= {"Banana","Kiwi","Apple","Mango"};
	//If fruit is apple-->that is your favorite fruit
	//advanced for loop, enhanced for loop,for each loop
	for(String fruit:fruits) {
		if(fruit.contentEquals("Apple")) {
			System.out.println(fruit+" is your favorite fruit");
		}else {
			System.out.println(fruit);
		}
	}
	

}
}
