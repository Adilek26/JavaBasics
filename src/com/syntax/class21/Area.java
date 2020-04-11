package com.syntax.class21;

public class Area {
//	Create 1 class in which create a methods that will calculate the area (volume) of 
//	Rectangle    Square      Box
	public int area(int a,int b) {
		int area=a*b;
		System.out.println("Area of rectangle is "+area);
		return area;
	}
	public void area(int a) {
		System.out.println("Area of square is "+(a*a));
	}
	public void area(int a,int b,int c) {
		System.out.println("Volume of box is "+(a*b*c));
	}
	
}
