package oopsession2;

import java.util.Scanner;

public class SurveyFile {
	int i = 0;
	String questions[];
	int rating[] = new int[5];
	String multiselect[] = new String[5];
	String feedback[] = new String[5];
	String service[] = new String[5];
	int warranty[] = new int[5];
	int j = 0;
//function to ask questions to user
	public int[] survey(QuestionRead q) {
		Scanner ob = new Scanner(System.in);
		int noofparticipant = 5;
		q.inputFile();
		questions = q.ques1;
		for (int i = 0; i < noofparticipant; i++) {
			System.out.println("participant" + (i + 1));
			System.out.println(questions[0]);
			rating[j] = ob.nextInt();                 //overall rating answer input by user
			if (rating[j] == 1 || rating[j] == 2 || rating[j] == 3
					|| rating[j] == 4) {
				ob.nextLine();
				System.out.println(rating[j]);
			} else {
				System.out.println("invalid choice");
			}
			System.out.println(q.ques1[1]);
			multiselect[j] = ob.nextLine();           //area of improvement answer
			ob.nextLine();
			System.out.println(multiselect[j]);
			System.out.println(q.ques1[2]);
			feedback[j] = ob.nextLine();                 //feedback question
			if (feedback[j] == "good" || feedback[j] == "bad"
					|| feedback[j] == "medium") {
				System.out.println(feedback[j]);
			} else {
				System.out.println("invalid choice");
			}
			System.out.println(q.ques1[3]);
			service[j] = ob.nextLine();            //service question
			System.out.println(service[j]);
			System.out.println(q.ques1[4]);
			warranty[j] = ob.nextInt();              //period of warranty question
			System.out.print(warranty[j]);
		}
		j++;
		return rating;
	}
//to calculate rating of single select
	public void calculateoverallrating() {

		int count[] = new int[5];
		int c3 = count[3];
		int c2 = count[2];
		int c1 = count[1];
		int c4 = count[4];
		int c = count[0];
		for (i = 0; i < 5; i++) {
			if (rating[i] == 1) {
				c++;
			} else if (rating[i] == 2) {
				c1++;
			} else if (rating[i] == 3) {
				c2++;
			} else if (rating[i] == 4) {
				c3++;
			} else {
				c4++;
			}
		}
		count[0] = (c / 5) * 100;
		count[1] = (c1 / 5) * 100;
		count[2] = (c2 / 5) * 100;
		count[3] = (c3 / 5) * 100;
		count[4] = (c4 / 5) * 100;
		for (i = 0; i < 5; i++) {
			System.out.println(count[i]);
		}
	}

	public static void main(String args[]) {
		QuestionRead qr = new QuestionRead();
		SurveyFile s = new SurveyFile();
		s.survey(qr);
		s.calculateoverallrating();
	}
}
