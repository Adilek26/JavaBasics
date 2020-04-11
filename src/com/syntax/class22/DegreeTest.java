package com.syntax.class22;

public class DegreeTest {
public static void main(String[] args) {
	Degree degree=new Degree("Adile");
    degree.getPrerequisite();
	
	Bachelors student=new Bachelors("Tugba");
	student.getPrerequisite();
	
	Masters student1=new Masters("Ahmet");
	student1.getPrerequisite();
	
}
}
