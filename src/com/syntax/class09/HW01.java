package com.syntax.class09;

public class HW01 {
public static void main(String[] args) {
	//Create an array of Chars and store grades into it:A,B,C,D,F.
	//then print a grade B (Use  2 different way of Creating)
	char [] grade=new char[6];
	grade[0]='A';
	grade[1]='B';
	grade[2]='C';
	grade[3]='D';
	grade[4]='E';
	grade[5]='F';
	System.out.println(grade[1]);
	
	
	char[] grade1= {'A','B','C','D','E','F'};
	
	System.out.println(grade1[1]);
}
}
