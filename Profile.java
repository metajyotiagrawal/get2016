package OOPS5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * class is to create a new profile whenever any user want to create profile it
 * call createFile method add these information into textfile profiledata.txt
 * @author jyoti
 *
 */
public class Profile {

	public void createFile() {
		String name = "", age = "", place = "", gender = "", ID = "";

		Scanner sc = new Scanner(System.in);
		try {
			FileWriter fw = new FileWriter(
					"C:/Users/admin/workspace/profiledata.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			System.out
					.println("Want to create new profile....so please enter the following information");
			System.out.println("Enter your id number");
			ID = sc.nextLine(); // input from user
			System.out.println("Enter name for your profile");
			name = sc.nextLine();
			System.out.println("Enter place where you live");
			place = sc.nextLine();
			System.out.println("Enter gender");
			gender = sc.nextLine();
			System.out.println("Enter your age");
			age = sc.nextLine();
			bw.write(ID + " "); // to write data in textfile
			bw.write(name + "\t");
			bw.write(place + "\t");
			bw.write(gender + "\t");
			bw.write(age);
			System.out.println("Profile is created");
			bw.newLine();
			bw.close(); // to close the file

		} catch (IOException e) {
			System.out.println("File not found");
		}
	}
}
