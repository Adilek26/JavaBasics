package com.syntax.class24;

public abstract class File {
//	Create a class File that will have the following behaviors:
//	open, edit, close. 
//	Edit and close are implemented method while open is an abstract.
//	Create 3 subclasses: JavaFile, WordFile, PDFFile that
//	will provide specific implementation of open behaviour: Example: to open .
//	java file we need notepad++ or sublime text, to open .doc file
//	we need Microsoft word to be installed etc
	public abstract void open();
	public void close() {
		System.out.println("File is closed now");
	}
	public void edit() {
		System.out.println("File is edited");
	}

}
class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("We need note pad to open Java file");
		
	}
	}
class WordFile extends File{

	@Override
	public void open() {
		System.out.println("We need to sublime for wordFile");
		
	}
}
class PDFFile extends File{

	@Override
	public void open() {
		System.out.println("We need to download it");
		
	}
}
