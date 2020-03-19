package com.syntax.class11;

public class Task01 {

	public static void main(String[] args) {
		String[][] cars= {
				{"american","german","korean","italian"},
				{"Ford","Mercedes","Hundai","Fiat"}		};
		for(int r=0; r<cars.length; r++) {
			for(int y=0; y<cars[r].length; y++) {
				System.out.print(cars[r][y]+" ");
			}System.out.println();
		}
	}

}
