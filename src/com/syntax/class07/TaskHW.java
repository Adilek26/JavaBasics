package com.syntax.class07;

public class TaskHW {
public static void main(String[] args) {
	for(int a=1; a<=100; a++) {
		System.out.print(a+" ");
	}
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
	
	
	for(int b=100; b>=1; b--) {
		System.out.println(b);
	}
	System.out.println("^^^^^^^^^^^^^^^^^^^^");
	//Way 1
	for(int x=20; x>1; x-=2) {
		System.out.println(x);}
		System.out.println("--------------------");
	//way2
	for(int y=20; y>1; y--) {
		if(y%2==0) {
			System.out.println(y);
		}
		
	}//Way1
	System.out.println("&&&&&&&&&&&&&&");
	for(int z=21; z<50; z+=2 ) {
		System.out.println(z);
		System.out.println("------------------");
		//Way2
	}for(int s=21; s<50; s++) {
		if(s%2!=0) {
			System.out.println(s);
		}
	}
}
}
