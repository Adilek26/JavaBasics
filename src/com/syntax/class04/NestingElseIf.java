package com.syntax.class04;

public class NestingElseIf {
	public static void main(String[] args) {
		boolean quizCompleted=false;
		int score=46;
		if(quizCompleted) {
			System.out.println("Let's your score");
		   if(score>90) {
			System.out.println("Great job , you study a lot");
		  }else if(score>80){
			System.out.println("Well done");
		  }else if(score>70){
			System.out.println("You could have done better");
			
		  }else{
			System.out.println("You failed");
		}
	}else {
			System.out.println("Please do your HW on time");
		
		
		}
		
	}

}
