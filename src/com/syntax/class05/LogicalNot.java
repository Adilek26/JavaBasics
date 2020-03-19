package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		boolean b=true;
		boolean val=false;
		System.out.println(b);
		System.out.println(val);
		
		boolean isCold=false;
		if(!isCold){
			System.out.println("Hello");
		}else {
			System.out.println("bye");
		}
		
     String day1="Tuesday";
    
     //if it isn't monday and friday-->Find me at Syntax
     if(!day1.equals("Monday")&& !day1.equals("Friday")) {
    	 System.out.println("Find me at Syntax");
     }
     //day is not Monday and Fiday-->Find me at Syntax
     if(!(day1.contentEquals("Monday") && day1.equals("Friday"))) {
    	 System.out.println("Find me at Syntax");
     }
	}

}
