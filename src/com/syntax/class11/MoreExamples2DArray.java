package com.syntax.class11;

public class MoreExamples2DArray {

	public static void main(String[] args) {
		//lets create 2D array in wich we store professions
		String[][] professions= {
				{"QA Tester","Developers","Prodoct owner","Scrum Master"},
				{"Math Teacher","Science Teacher","ESL Teacher"},
				{"Dentist","Surgeon"}
		};
		//get elements using advanced for loop
		for(String[] occupation:professions) {
			for(String title:occupation) {
				System.out.print(title+" ");
			}System.out.println();
		}
//to make reverse;
		String str="Adile";
		char[] array=str.toCharArray();
		System.out.println("String length is "+array.length);
		for(int i=array.length-1; i>=0;i--) {
			System.out.print(array[i]);
		}
		
		
//		String reverse="";
//		int length=professions.length;
//		for(int i=length-1; i>=0;i--) {
//			reverse=reverse+length.charAt(i);
//			
//		}System.out.println(reverse);
	}

}
