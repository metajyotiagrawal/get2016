package oopsession2;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.File;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionRead {
	String ques[];
	String count;
	String ques1[] = new String[5];
//function to read data from input file
	public void inputFile() {
		try {
			FileInputStream fstream = new FileInputStream(
					"c:/users/admin/workspace/input.txt");
			// Get the object of DataInputStream
			DataInputStream fs = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(fs));
			int i = 0;
			while ((count = br.readLine()) != null) {

				ques = count.split(",");
			     ques1[i] = ques[0];
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String[] getquestion()
	{
		return ques1;
	}

	public static void main(String args[]) {
		QuestionRead qr = new QuestionRead();
		qr.inputFile();
	}
}
