package com.syntax.class10;

public class Largest {
public static void main(String[] args) {
	//find largest element from an array
	int[]nums= {200, 30, -1, 900, 56, 787};
	int largest =0;
	for (int i:nums) {
		if(i>largest) {
			largest=i;
		}
		//syso burda olunca tekrar tekrar deger veriyor
		
	}
	System.out.println("The largest num is "+largest);
	
	
}
}
