package com.syntax.class24;

public abstract class Phone {
//implement methods
	public void call() {
		System.out.println("Phone make a call");
	}
	public void text() {
		System.out.println("Phone can send text");
	}
	//unimplemented methods= undefined methods=abstract methods
	public abstract void takePicture();
	public abstract void playMusic();
}
class iPhone extends Phone{

	@Override
	public void takePicture() {
		System.out.println("IPhone takes pictures");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Iphones play music from apple stre");
		
	}
	
	
}
class Samsung extends Phone{

	@Override
	public void takePicture() {
		System.out.println("Samsung takes pictures");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Samsung play music from apple stre");
		
	}
}