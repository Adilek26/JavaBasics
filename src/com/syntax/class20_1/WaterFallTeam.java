package com.syntax.class20_1;

import com.syntax.class20.Employee;

public class WaterFallTeam extends Employee{
	public static void main(String[] args) {
		WaterFallTeam wteam=new WaterFallTeam();
		WaterFallTeam.company="Syntax";
		wteam.empNumber=124;//protected class is visible to child class in dif package
		//wteam.salary//default is not visible
	}

}
