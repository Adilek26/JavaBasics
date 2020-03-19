package com.syntax.class12;

public class StringLengthAndManupulations1 {

	public static void main(String[] args) {
		
		String str="Good Morning Students!";
		System.out.println("-------charAt() FUNCTIONS------");
		char letter1=str.charAt(0);
		System.out.println(letter1);
		char letter5=str.charAt(4);
		System.out.println("Letter at index 4 is:"+letter5);//it is empty
//		char someLetter=str.char(55);//Runtime Exeption-->StringIndexOutOfBounds Expection
//		System.out.println(someLetter);
//		
		
		//get all caracters 1 by 1 from a string?
		char letter;
		for(int i=0; i<str.length(); i++) {
			letter=str.charAt(i);
			System.out.print(letter+" ");
		}
		System.out.println();
		System.out.println("----indexOf() FONCTION------"); 
		String name="Syntax Tecnologies";
		int index=name.indexOf("y");//1
		System.out.println(index);
		 index=name.indexOf(" ");//6
		System.out.println(index);
		index=name.indexOf("Syntax");
		System.out.println(index);//0 first car
		index=name.indexOf("!");
		System.out.println("Index of not existing car="+index);//-1
		index=name.indexOf("Tecnologies");
		System.out.println(index);//7 because of first character
		
		index=name.indexOf("o");
		System.out.println(index);//11
		index=name.lastIndexOf("o");
		System.out.println(index);//13
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
