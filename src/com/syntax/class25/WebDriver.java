package com.syntax.class25;

public interface WebDriver {
//	Create a WebDriver Interface that will have the following unimplemented behaviour:
//		openBrowser(), closeBrowser(), maximizeWindow(),
//	findElement(). Create 2 classes that implements WebDriver interface:
//		ChromeDriver and FirefoxDriver.
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}
 interface TakesScreenShut{
	
	void takePicture();
}
class ChromeDriver implements WebDriver,TakesScreenShut{

	@Override
	public void openBrowser() {
		System.out.println("ChromeDriver opens browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("ChromeDriver closes  browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("ChromeDriver maximizes Window browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("ChromeDriver finds elements browser");
		
	}

	@Override
	public void takePicture() {
		System.out.println();
		
	}
	
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("FirefoxDriver opens browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("FirefoxDriver closes  browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("FirefoxDriver maximizes Window browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("FirefoxDriver finds elements browser");
		
	}
	
}