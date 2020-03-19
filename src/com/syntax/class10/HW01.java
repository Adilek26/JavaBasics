package com.syntax.class10;

public class HW01 {
public static void main(String[] args) {
	/*Create 2D array where you will store the following values:
	 * Mr,Mrs,Ms,Miss and
	 * Smith,Jordan ,Jackson,Obama.
	 * Print: Mrs Smith, Mr Obama, Ms Jackson,Miss Jordan
	 */
	String[][] inital= {{"Mr","Mrs","Ms","Miss"},
			{"Smith","Jordon","Jakson","Obama"}
	};
	System.out.println(inital[0][1]+" "+inital[1][0]);
	System.out.println(inital[0][0]+" "+inital[1][3]);
	System.out.println(inital[0][2]+" "+inital[1][2]);
	System.out.println(inital[0][3]+" "+inital[1][1]);
			}
}
