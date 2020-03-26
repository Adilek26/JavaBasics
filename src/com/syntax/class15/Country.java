package com.syntax.class15;

public class Country {

	static String countries(String word) {
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
		// TODO Auto-generated method stub
		String ans;
		ans.countries("Turkey");
		ans.countries("Usa");
		ans.countries("Mexico");

	}

}
