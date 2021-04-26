package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game {
	public static ArrayList<Question> questionSet;
public Game() {
	questionSet= new ArrayList<Question>();
	String q = "where does the sun rise?";
	String [] a= {"east", "west", "south", "North"};
	questionSet.add(new Question(q,a,"east"));
	q ="Who invented thi telephone";
	//must reuse variable with new string[]
	// array constants can onlu be used during initialization
	a= new String[] { "thomas edison", "michael faraday", "james wattson", "alexander bell"};
	questionSet.add(new Question(q,a,"alexander bell"));
	
	q= "where is the capital of japan?";
	a= new String [] {"beijing", "tokyo", "seul", "bankok"};
	questionSet.add(new Question(q,a,"tokyo"));
	Collections.shuffle(questionSet, new Random());
		
}	
	public void start () {
		Scanner scan= new Scanner(System.in);
		int numCorrect=0;
		//show questions from questionSet
		for (int question=0; question< questionSet.size(); question++) {
			
			System.out.println(questionSet.get(question).getQuestion());
			int numChoices = questionSet.get(question).getChoices().size();
			for (int choice = 0; choice < numChoices; choice++) {
				System.out.println((choice+1)+ ":" + 
			questionSet.get(question).getChoices().get(choice));
						
			}
			int playerAnswer = scan.nextInt();
			ArrayList<String> choiceSet= questionSet.get(question).getChoices();
			
			String correctAnswer= questionSet.get(question).getAnswer();
			int correctAnswerIndex= choiceSet.indexOf(correctAnswer);
			if(playerAnswer==correctAnswerIndex) {
				numCorrect++;
			}
				
			
		}
		scan.close();
		System.out.println("you got  "+ numCorrect + " correct answer(s)");
	}
	
}
