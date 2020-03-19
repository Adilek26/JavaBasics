package com.syntax.class04;

import java.util.Scanner;

public class Boolean {
	public static void main(String[]args){
	    Scanner dc=new Scanner(System.in);
	    System.out.println("Please enter first number");
	    int x=dc.nextInt();
	    System.out.println("Please enter second number");
	    int y=dc.nextInt();
	    int num=x*y;
	    if(num>0){
	      System.out.println(true);
	    }else{
	      System.out.println(false);
	    }
	  }
	 
}
