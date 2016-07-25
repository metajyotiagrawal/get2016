package OOPS4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.File;
/**
 * FileChoose is menu
 * open and new  is submenu of FileChoose
 * Open is used to open existing file
 * new is used to create new file
 * @author jyoti
 *
 */

public class FileChooseMenu {
	private String userChoice[] = { "Open", "new" };
/*
 * to check whether user enter new or open
 * if open then call fileOpen function
 * if new then call newfile function
 * 
 */
	public void getUserChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user choice");
		String userCh = sc.nextLine();
		if (userCh.equalsIgnoreCase("Open")) {
			fileOpen();
		} else if (userCh.equalsIgnoreCase("new")) {
			filenew();
		}
		else{
			System.out.println("Enter available submenu");      //to check user will not enter any other choice
		}
}
/*
 * function to open a existing file
 */
	public void fileOpen() {
		try {
			FileInputStream fstream = new FileInputStream(
					"c:/users/admin/workspace/open.txt");
			// Get the object of DataInputStream
			DataInputStream fs = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(fs));
			String s = br.readLine();
			System.out.println(s);           
			fstream.close();
		} catch (IOException e) { // return Exception
			e.printStackTrace();
		}
	}
/*
 * function to form a new file
 */
	public void filenew() {
		try {
			File f = new File("C:/users/admin/workspace/newfile.txt");
			if (!f.exists()) { // if file not exist create it
				f.createNewFile();
			}
		} catch (IOException e) { // return Exception
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		FileChooseMenu f = new FileChooseMenu();
		f.getUserChoice();
	}
}
