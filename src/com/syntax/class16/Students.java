package com.syntax.class16;

public class Students {
//	Create a Class called Students
//	Create three  variables studentName , studentID  and numberOfStudents
//	Create three objects of the Students Class 
//	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	Print out  total number of students

String studentName;
int studentID, numberOfStudents;
public void increment() {
	System.out.println(numberOfStudents);
}

public static void main(String[] args) {
	Students str=new Students();
	str.studentName="Tugba";
	str.studentID=123454;
	str.numberOfStudents=1;
	str.increment();
	
}

}
