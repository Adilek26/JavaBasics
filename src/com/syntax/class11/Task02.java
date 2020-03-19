package com.syntax.class11;

public class Task02 {
public static void main(String[] args) {
	String [][] countries= {{"US","Canada","Mexico"},
			{"Brezil","Venezuella","Peru"},
			{"France","Italy","German","Spain"},
			{"China","South Korea","Japan","Rusia"},
			{"Egypt","Kenya","South Africa"}
			
	};
	for(int x=0; x<countries.length; x++) {
		
		for(int y=0; y<countries[x].length; y++) {
			
			System.out.print(countries[x][y]+" ");
			
		}System.out.println();
		
	}
	int count=0;
	for(String country[]:countries) {
		for(String cnty:country) {
			System.out.print(cnty+" ");
			count++;
						
			
		}System.out.println();
	}
	System.out.println("Total is: "+count);
	
}
}
