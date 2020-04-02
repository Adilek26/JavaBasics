package com.syntax.class18;

public class Task03 {
//	Write a program  that will have 4 different access levels of constructors
//	and create 3 objects of this class:
	//1 - inside same class;
//	2 - from outside the class;
//	3 - from different class inside different package  and observe result.
//Write program that have static constructor and observe result.
	public Task03() {
	System.out.println("This will be work everywhere");
	}
	private Task03(int x) {
		System.out.println("Private can work just in class");
	}
	//static Task03(String word) {CE;invalid modifier
	//	System.out.println("This is Static");
		
	//}
	protected Task03(boolean a) {
		System.out.println("Protected works inside the packet");
	}
	Task03(int n, int g){
		System.out.println("This is default constructor");
	}
	public static void main(String[] args) {
		Task03 obj=new Task03();
		Task03 obj1=new Task03(12);
		//Task03 obj2=new Task03("Hello");
		Task03 obj3=new Task03(true);
		Task03 obj4=new Task03(14,67);
	}
	
}
