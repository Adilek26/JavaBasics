package com.syntax.class21;

public class Overloaded {
//	Create 1 class with a private method that has 3 overloaded forms.
	// Then call each overloaded method with specific arguments and observe result.
	private static void word(int s) {
		System.out.println(s + " integer parameter");
	}

	private static void word(String s1) {
		System.out.println(s1 + " has a parameter");
	}

	private static void word(String s1, String s2) {
		System.out.println(s1 + s2 + " has two parameters");
	}

	public static void main(String[] args) {
		Overloaded obj = new Overloaded();
		obj.word(5);
		obj.word("Class");
		obj.word("New ", "construcktor");
	}
}
