package com.syntax.class21;

public class UserClass {
//	Write program: userClass  that has a constructor 
//	that initializes instance variable name and mobile number.
//	Create a subclass  userInfo that will have user address variable and 
//	it also being initialized through constructor call. 
//	Print users name, mobile number and address in userDetails method.
//	Test your code.
	String name;
	String mNumber;
	UserClass(String name,String mNumber){
		this.name=name;
		this.mNumber=mNumber;
	}
}
public class UserInfo extends UserClass{
	String userAddress;
	public UserInfo(String name,String mNumber,String userAddress){
		super(mNumber,name);
		
	}
	
	
}
