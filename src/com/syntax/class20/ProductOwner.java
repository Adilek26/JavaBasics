package com.syntax.class20;

public class ProductOwner extends ScrumTeam {
	void prioritizeBacklog() {
		System.out.println("PO prioriritizes backlog  "+ceremonies);
	}

}
 class ScrumMaster extends ScrumTeam {
	void navigateTeam() {
	System.out.println("SM is collobrating team for "+company);
	}
 }
	class Developer extends ScrumTeam{
		void coding() {
			System.out.println("He/she makes all codes");
		}
	}
		 class Tester extends ScrumTeam{
			void test() {
				System.out.println("He is testing"+ceremonies);
			}
		 }
			 class BussinestAnalyst extends ScrumTeam{
				void workWithRequirements() {
					System.out.println("He is working");
				
				}
			 }
		
	

