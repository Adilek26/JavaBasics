package com.syntax.class15;

public class MethodsReturningValue {
public static void main(String[] args) {
	//create a string and based on the length of the string
	//we define wheter string is short or long
	
	String str="Hello my friend";
	int length=str.length();
	if(length>10) {
		System.out.println("String is long");
	}else {
		System.out.println("String is short");
	}
	
	//compare 2 numbers and than we identify whether largers
	Number obj=new Number();
	//int num=obj.lNum(10,20);CE since lNumdoesn't return any value
	//int num=obj.lNum(12,13);
	MethodsReturningValue newObject=new MethodsReturningValue();
	int  num=newObject.lNum(12,13);
	boolean flag=newObject.isOdd(num);
	System.out.println("Largest number "+num+" is odd number:"+flag);
}
//create a method that returns largest num from 2 given numbers
int lNum(int a,int b) {//we chanced void-->int
	int lNum;
	if(a>b) {
		lNum=a;
	}else {
		lNum=b;
	}
	return lNum;
}
boolean isOdd(int num) {//void-->boolean
	boolean isOdd;
	if(num%2==0) {
		isOdd=false;
	}else {
		isOdd=true;
	}
	return isOdd;
}
}
