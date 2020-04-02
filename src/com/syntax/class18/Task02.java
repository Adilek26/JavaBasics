package com.syntax.class18;

public class Task02 {
	
//	Write a java program of Class Students that takes students name 
	//and 3 subject grades. 
	//Inside your class also have a method to Calculate Average Grade.
	//Test Student class for 5 different students with different marks.
	//Your program should print an average mark of each students name.
////	NOTE: please use different names for instance and local variables.

	String sName;
	int grade1,grade2, grade3;
	Task02(String std, int grd1,int grd2, int grd3){
		sName=std;
		grade1=grd1;
		grade2=grd2;
		grade3=grd3;
		System.out.println(std+" your average is "+(grd1+grd2+grd3)/3);
	}
	public static void main(String[] args) {
		
	
	Task02 std1=new Task02("Ahmet",95,99,96);
	Task02 std2=new Task02("Tugba",90,97,90);
	Task02 std3=new Task02("Julia",92,90,95);
	Task02 std4=new Task02("Gulsum",96,90,97);
	Task02 std5=new Task02("Ayse",94,91,93);
}
}