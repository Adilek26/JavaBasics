package com.syntax.class25;

public interface Trustable {
	//by default will make method to be public and abstract
void trust();
}
interface Bank extends Trustable{
	
	void depositMoney();
	void withdraw();
}
class BOA extends Finance implements Bank,CreditUnion{

	@Override
	public void trust() {
		System.out.println("BOA is trustable");
		
	}

	@Override
	public void depositMoney() {
		System.out.println("You can make a deposit at BAO");
		
	}

	@Override
	public void withdraw() {
		System.out.println("You can withdraw your money in BOA");
		
	}

	@Override
	public void giveCredit() {
		System.out.println("BOA gives credit ");
		
	}}
interface CreditUnion{
	void giveCredit();
}
class Finance{
	public void financing() {
		System.out.println("We can give finance");
	}
}