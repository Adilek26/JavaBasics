package com.syntax.class05;

import java.util.Scanner;

public class TaskHW01 {
public static void main(String[] args) {
	Scanner sc;
	double quiz;
	double midTerm;
	double finals;
	String grade;
	double avScore;
	
	sc=new Scanner(System.in);
	
	System.out.println("Please enter your quiz score");
	quiz=sc.nextDouble();
	System.out.println("Please enter your midTerm score");
	midTerm=sc.nextDouble();
	System.out.println("Please enter your finals score");
	finals=sc.nextDouble();
	avScore=(quiz*0.2)+(midTerm*0.3)+(finals*0.5);
	if(avScore>=90){
		grade="A";
		}else if(avScore<90 && avScore>=70) {
		grade="B";
	    }else if(avScore<70 && avScore>=50) {
		grade="C";
	    }else {
		grade="F";
	}System.out.println("Your Grade is "+grade);
}
}
