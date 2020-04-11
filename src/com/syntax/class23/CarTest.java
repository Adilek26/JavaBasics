package com.syntax.class23;

public class CarTest {
public static void main(String[] args) {
	Car bmw = new BMW("BMW");
	bmw.display();
	bmw.start();
	//bmw.navigate();CE: undefined method in Car
	Car tesla = new Tesla("Tesla");
	//Car merc = new Mercedes("Mercedes");
	//Car honda = new Honda("Honda");
//	Car bmw=new BMW("BMW");
//	bmw.display();
//	bmw.start();
//	Car tesla=new Tesla("Tesla");
//	tesla.start();
//	//tesla.elektrical();
//	Car mersedes=new Mersedes("Mersedes");
//	mersedes.start();
//	
////	Car []cars={new BMW("BMW"),new Tesla("Tesla"),
////			new Mersedes("Mersedes"),
////			};
//	//{"BMW","Tesla","Mersedes","Honda"}; also available
//	for(Car c:cars) {
//		c.start();
//		c.display();
//		System.out.println("-----------");
//	}
//}
	System.out.println("----------------------------");

	
}}
