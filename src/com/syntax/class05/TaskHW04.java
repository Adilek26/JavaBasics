package com.syntax.class05;

import java.util.Scanner;

public class TaskHW04 {
public static void main(String[] args) {
	
	Scanner input;
	double num1,num2,num3,largest = 0;
	 input=new Scanner(System.in);
	System.out.println("Please enter a double value");
	num1=input.nextDouble();
	System.out.println("Please enter second double value");
	num2=input.nextDouble();
	System.out.println("Please enter thirth double value");
	num3=input.nextDouble();
	
	
	if(num1>num2) {
		if(num1>num2) {
			largest=num1;
		}else {//num1>num2 but num1<num3
			largest=num3;
		}
	}else {//num2>num1
		if(num2>num3) {//num2 is bigger than num1 and num2>num3
			largest=num2;
		}else {//num2>num1 but  num2<num3
			largest =num3;
		}System.out.println("The largest number is "+largest);
	}
}

}
