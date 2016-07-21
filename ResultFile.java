package oopsession2;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class ResultFile extends SurveyFile {
	int i=0;
	
	//function to input data in file
	public void resultFile(QuestionRead qs) {
		qs.inputFile();
		int rat[]=survey(qs);
		try {
			File file = new File("C:/users/admin/workspace/outputfile.txt");
			if (!file.exists()) {               //if file not exist create it
				file.createNewFile();
			}
			FileWriter fw = new FileWriter("outputfile.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			for (int i=0; i<rat.length ; i++){
	            bw.write(rat[i]);                 //fuction to write data in output.txt file
	            System.out.println(rat[i]);
	        }
				
			System.out.println("done");
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
//main function
	public static void main(String args[]) {
		QuestionRead qt = new QuestionRead();
		SurveyFile su=new SurveyFile();
		ResultFile qr = new ResultFile();
		qr.resultFile(qt);
	}
}
