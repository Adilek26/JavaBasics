package com.syntax.class19;

public class Teachers {
//	Write a Java program called Teacher. 
//	Identify features and behaviour of that Class.
//	Create 3 subclasses MathTeacher,
//	ChemistryTeacher and PianoTeacher that would
//	have it their own features and behaviour. 
//	Test all 4 classes 
	String name,title;
	int age;
	public void educate() {
		System.out.println(name+" is "+age+" years old and"
				+ " likes to teach "+title);
	}
	public static void main(String[] args) {
		MathT teacher=new MathT();
		teacher.name="Nancy";
		teacher.title="Math ";
		teacher.age=40;
		teacher.educate();
		teacher.numbers();
		PianoT teacher1=new PianoT();
		teacher1.name="Nina";
		teacher1.title="Music";
		teacher1.age=28;
		teacher1.instrument="Piano";
		teacher1.educate();
		teacher1.instruments();
		ChemistryT teacher2=new ChemistryT();
		teacher2.name="Novera";
		teacher2.title="Chemistry ";
		teacher2.age=35;
		teacher2.classroom="Lab";
		teacher2.educate();
		teacher2.teach();
		
	}
}
