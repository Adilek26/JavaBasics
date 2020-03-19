package com.syntax.class09;

public class NestedLoop {
public static void main(String[] args) {
for(int i=1; i<=3; i++) {
	
	for(int j=1; j<=3; j++) {
		System.out.println(i+ " "+j);
}
	}
System.out.println("888888888888888");
//using nested loop to print 10 until 99
for( int i=1; i<=9; i++) {
	for( int y=0; y<=9; y++) {
		System.out.println(i+""+y);
	}
}
}
}
