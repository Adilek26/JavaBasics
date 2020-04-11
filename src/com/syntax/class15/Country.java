package com.syntax.class15;

public class Country {

	static String country(String word) {
		String country = "";

		switch (country) {
		case "Usa":

			word = "Hello";
			break;
		case "Turkey":
			word = "Selam";
			break;
		case "Mexico":
			word = "Hola";
			break;
		default:
			word = "invalid";
			break;

		}
		System.out.println(" people are greeting " + word);
		return country;

	}

	public static void main(String[] args) {
		
		Country ans=new Country();
		
		ans.country("Selam");
		
		ans.country("Usa");
		ans.country("Mexico");

	}

}
