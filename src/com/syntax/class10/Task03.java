package com.syntax.class10;

public class Task03 {

	public static void main(String[] args) {
		String[] countries= { "Turkey", "Germany", "Spain", "Mexico", "Canada"};
		for(String cap:countries) {
			if(cap=="Turkey") {
				System.out.println("Ankara is capital of "+cap);
			}else if(cap==("Germany")) {
				System.out.println("Berlin is the capital of "+cap);
			}else if(cap==("Spain")) {
				System.out.println("Madrid is the capital of "+cap);
			}else if(cap==("Mexico")) {
				System.out.println("Mexico city is the capital of "+cap);
			}else if(cap==("Canada")) {
				System.out.println("Ottava is the capital of "+cap);
			}
		}System.out.println("--------------2nd way-------------");
for(int y=0; y< countries.length; y++) {
	switch(countries[y]) {
	case "Turkey":
		System.out.println("The capital is Ankara");
		break;
		
	}
}
	}

}
