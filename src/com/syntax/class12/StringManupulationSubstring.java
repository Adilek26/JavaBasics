package com.syntax.class12;

public class StringManupulationSubstring {

	public static void main(String[] args) {
		//to get substring from a given String
		//substring =String inside your String
		System.out.println("----------substring() FUNCTION-------");
		String str="Today is a rainy day";
		str.substring(6);
		String partialString=str.substring(6);//start point
		System.out.println(partialString);
		
		//rainy day
		partialString=str.substring(11);
		System.out.println(partialString);//rainy day
		
		//Today
		partialString=str.substring(0,5);//start and end point
		System.out.println(partialString);
		
		//rainy
		partialString=str.substring(11,16);//i=11; i<16
		System.out.println(partialString);
		

	}

}
