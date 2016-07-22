package oopsession2;

import java.util.Arrays;

public class Sorting {
	
	SurveyFile st[]=new SurveyFile[5];     //object array of SurveyFile class
	Questions[] q;
	String s[];
	public static void main(String args[]) {
		Sorting sort=new Sorting();
		sort.sortMethod();
	}
	//function to sort question
	public void sortMethod() {
		QuestionRead qr = new QuestionRead();
		qr.inputFile();                           //calling fuction of QuestionRead class
	     s=qr.getquestion();
		q=new Questions[s.length];
		
		for(int i=0;i<s.length;i++) {
			
			q[i] = new Questions();
			q[i].setQues(s[i]);
			}
		Arrays.sort(q);                             //sorting array of object
		for(int i=0;i<5;i++){
			System.out.println(q[i].getQues());
		}
	}
	
}
