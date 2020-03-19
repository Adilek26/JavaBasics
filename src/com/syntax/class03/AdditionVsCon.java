package com.syntax.class03;

public class AdditionVsCon {
	public static void main(String[ ]args) {
		int a=10;
		int b=20;
		String x="Hello";
		String y="Bye";
		//ctrl+space --> autocomplete
		System.out.println(a+b+x+y);
		System.out.println(a+x+b+y);
		System.out.println(x+y+a+b);
System.out.println(x+y+(a+b));
//1020HelloBye
System.out.println(a+""+b+x+y);
	}

}
