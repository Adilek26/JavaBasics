package com.syntax.class15;

public class CreatingMethods {
// we want to create a  method that will accept marks()
	//based on the marks it will return garde(A,B,C)
	//if garde>90-->A, if 90<grade>80-->B,
	//if 80<grade>70-->C
	char  marks(int grades) {
		char grd = 0;
		if(grades>=90) {
			grd='A';
		}else if(grades<90 && grades>=80) {
			grd='B';
		}else if(grades<80 && grades>=70) {
			grd='C';
		}else {
			grd='F';
		}
		return grd;
				
	}
	public static void main(String[] args) {
		CreatingMethods cart=new CreatingMethods();
		char grd=cart.marks(86);
		
		System.out.println(cart.marks(65));
		
		System.out.println(grd);
	}
}
