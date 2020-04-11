package com.syntax.class21;

public class Circle extends Shape{
		double pi;
		public Circle(double pi,int radius){
			super(radius);
			this.pi=pi;
			System.out.println("Area of circle is "+(pi*super.radius*super.radius));
		}
		
		public static void main(String[] args) {
			Circle s=new Circle(3.14,5);
			
		}
	}

