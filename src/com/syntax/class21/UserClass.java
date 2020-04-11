package com.syntax.class21;

public class UserClass {
//	Write program: userClass  that has a constructor 
//	that initializes instance variable name and mobile number.
//	Create a subclass  userInfo that will have user address variable and 
//	it also being initialized through constructor call. 
//	Print users name, mobile number and address in userDetails method.
//	Test your code.
	public String uName;
	public String mNumber;
	public UserClass(String name,String mNumber){
		this.uName=name;
		this.mNumber=mNumber;
	}
}
class UserInfo extends UserClass{
	String userAddress;
	public UserInfo(String uName,String mNumber,String userAddress){
		super(mNumber,uName);
		this.userAddress=userAddress;
	}
	public void userDetails() {
		System.out.println(super.uName+" "+super.mNumber+" "+userAddress);
	}
}
class Main{
	public static void main(String[] args) {
		UserInfo str=new UserInfo("George","512 701 6878","504 Elm Street");
		str.userDetails();
		
		
	}
}