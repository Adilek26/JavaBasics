package com.syntax.class11;

public class StringArrays {

	public static void main(String[] args) {
		String[] [] groceries= {
				{"cucamber","patato", "carrot"},
				{"mango", "apple", "banana","kiwi"},
				{"milk", "chese","yogurt"}
		};
		System.out.println(groceries[1][2]);
		//get all values from 2D array
		for(int r=0; r<groceries.length; r++) {
			for(int c=0; c<groceries[r].length; c++) {
				System.out.print(groceries [r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("--Getting Elements using advanced for loop");
		
		for(String[]array:groceries) {
			for(String items:array) {
				System.out.print(items+" ");
			}
			System.out.println();
		}
		
		
	}

}
