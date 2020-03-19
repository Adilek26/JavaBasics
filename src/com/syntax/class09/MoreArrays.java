package com.syntax.class09;

public class MoreArrays {
public static void main(String[] args) {
	
	//Arrays are fixed in size
	String[] students =new String[3];
	students[0]="Hassna";
	students[1]="Faisal";
	students[2]="Kemal";
	//students[3]="Aaron";--> during run timejava machine will give
	 //  ArrayIndexOutOfBoundsExpections
	//System.out.println(students[3]);
	
	// if we store less elements then we declared
	//compiler will add default values (null)
	String[] inClassStudents =new String[5];

	inClassStudents[1]="Hiccam";
	inClassStudents[2]="Tetteh";
	inClassStudents[3]="Hiccam";
	inClassStudents[4]="Tetteh";
	inClassStudents[5]="Hiccam";
	
	System.out.println(inClassStudents[0]); //null
	System.out.println(inClassStudents[5]);// still same error
}
}
