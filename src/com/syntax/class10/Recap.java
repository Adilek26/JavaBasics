package com.syntax.class10;

public class Recap {
public static void main(String[] args) {
	int[] grades=new int[4];
	grades[0]=90;
	grades[1]=67;
	grades[2]=89;
	grades[3]=78;
	
	//what is average?
	int average=(grades[0]+grades[1]+grades[2]+grades[3]);
	System.out.println("Average grade is "+average);
	//---------------------------
	String [] cities= {"Washington DC","New York","Paris","miami" 
			,"Los Angeles", "Dallas","Chantilly"};
	//lives in Paris
	System.out.println(cities[2]);
	
	int x=1;
	System.out.println(cities[x]);//new york
	x+=3;
	System.out.println(cities[x]);
	//how many elements stored inside array?
	int arraySize=cities.length;//7
	System.out.println("Total elements "+arraySize);
	//how many elements we access element from an array?
	System.out.println(cities[arraySize-1]);
	//access all elements from an array
	//cities[0], cities[1]...
	for (int i=0;i<arraySize; i++);
	System.out.println(cities[arraySize]);
	//access all elements from an array
	//cities[0, cities[1],cities[2]}
	for(int i=0; i<arraySize; i++) {
		System.out.println(cities[i]);
	}
}  
}
