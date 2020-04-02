package com.syntax.class19;

public class Book {
//	Write program as a Book class   that will have 2 Constructors. 
//	While creating an object make sure:
//		Instance variables are being initialized
//		Both Constructors are being executed
String book1,book2, author;
public Book(String book1,String book2) {
	this.book1=book1;
	this.book2=book2;
	
}
public Book(String author) {
	this.author=author;
	
}
public void belongs() {
	System.out.println("The "+book1+" and "+book2+" created by "+author);
}
public static void main(String[] args) {
	Book str=new Book("Snow","Red");
	str.belongs();
	Book str1=new Book("Orhan Pamuk");
	str1.belongs();
}
		
}
