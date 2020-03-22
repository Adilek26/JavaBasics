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
		String reverse;
		
		for(int i=professions.length-1; i>=0;i--) {
			reverse=reverse+professions.length.charAt();
			
		}
	}

}
