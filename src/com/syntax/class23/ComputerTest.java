package com.syntax.class23;

public class ComputerTest {
public static void main(String[] args) {
	Computer [] computer= {new Apple("Apple"),new Lenovo("Lenovo")
			,new HP("HP"),new Dell("Dell")};
	
	for(Computer c:computer) {
		c.connectInt();
		//c.design();
		c.keyBoard();
		Apple app=new Apple("Apple");
		app.apps();
		HP hp=new HP("HP");
		hp.strong();
		
	}
	//downcasting
			//Apple computer=new Computer("Comp");
			//Apple applec=(Apple)new Computer("Computer");
}
}
