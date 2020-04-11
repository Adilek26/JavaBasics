package com.syntax.class25;

public class WebDriverTest {
public static void main(String[] args) {
	WebDriver st=new ChromeDriver();
	st.openBrowser();
	st.closeBrowser();
	st.maximizeWindow();
	st.findElement();
	ChromeDriver str=new ChromeDriver();
	str.closeBrowser();
	str.openBrowser();
	str.maximizeWindow();
	
	
	FirefoxDriver obj=new FirefoxDriver();
	obj.closeBrowser();
	obj.maximizeWindow();
	obj.closeBrowser();
	obj.findElement();
	
}
}
