package com.syntax.class07;

public class PostAndPreIncrement {
public static void main(String[] args) {
	//++  ,--
	//preincrement ++y, postincrement y++
	int z=10;
	int  y=10;
	y=z++;
	System.out.println(z);
	
	
	int w;
	int x=10;
	w=++x;
	System.out.println(w);
	
	int num=1;
	while(num<5) {
		System.out.println(num++);
	}System.out.println("&&&&&&&&&&&&&&&&&");
	
	int num2=1;
	while (num2<5) {
		System.out.println(++num2);
	}
}
}
