package com.syntax.class20;

public class TestClass {
public static void main(String[] args) {
	ProductOwner str=new ProductOwner();
	str.company="Syntax";
	str.salary=5000;
	//str.ssn=12345678; private cannat reach another class
	ScrumTeam str1=new ScrumTeam();
	str1.attendMeetings();
	str1.ceremonies="Spring Backlog";
	System.out.println(str.company+" "+str1.ceremonies+
			" "+str.salary);
	
}
}
