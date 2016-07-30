package oops;

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
 * 
 * @author jyoti
 *
 */
public class Profile {
	private static String name, age, place, gender, ID;
	private String line;
	private String count;
	private static String path = "c:/users/admin/workspace/profiledata.txt";

	public static String getPath() {
		return path;
	}

	public static void setPath(String path) {
		Profile.path = path;
	}

	private static ArrayList<String> list1 = new ArrayList<String>();
	private static String arr[] = new String[10];

	public ArrayList<String> getList1() {
		return list1;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Profile.name = name;
	}

	public static String getAge() {
		return age;
	}

	public static void setAge(String age) {
		Profile.age = age;
	}

	public static String getPlace() {
		return place;
	}

	public static void setPlace(String place) {
		Profile.place = place;
	}

	public static String getGender() {
		return gender;
	}

	public static void setGender(String gender) {
		Profile.gender = gender;
	}

	public static String getID() {
		return ID;
	}

	public static void setID(String iD) {
		ID = iD;
	}

	public void createFile() {

		Scanner sc = new Scanner(System.in);
		try {
			FileWriter fw = new FileWriter(path, true);
			BufferedWriter bw = new BufferedWriter(fw);
			System.out
					.println("Want to create new profile....so please enter the following information");
			System.out.println("Enter name for your profile");
			name = sc.nextLine();
			System.out.println("Enter place where you live");
			place = sc.nextLine();
			System.out.println("Enter gender");
			gender = sc.nextLine();
			System.out.println("Enter your age");
			age = sc.nextLine();
			bw.write(name + ",");
			bw.write(place + ",");
			bw.write(gender + ",");
			bw.write(age);
			System.out.println("Profile is created");
			bw.newLine();
			bw.close(); // to close the file
			sc.close();

			String last = "";
			int j = 0;
			int flag = 0;
				File f = new File(path);
				BufferedReader input = new BufferedReader(new FileReader(f));
				while ((line = input.readLine()) != null) {
					last = line;
					flag = 1;
				}
			String ID[] = last.split(",");
			String id1 = ID[0];
			if (flag == 1) {
				j = Integer.parseInt(id1);
				j = j + 1;
			}
			System.out.println(id1+",");
			input.close();
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}

	// function to show profiles on console
	public void show() {
		try {
			FileInputStream fstream = new FileInputStream(path);
			// Get the object of DataInputStream
			DataInputStream fs = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(fs));
			Scanner s = new Scanner(new File(path));
			String line;
			int j = 0;
			while (s.hasNext()) {
				line = s.nextLine();
				list1.add(line);
				String str[] = list1.get(j).split(" ");
				arr[j] = str[1];
				j++;
			}
			s.close();
			for (int i = 0; i < list1.size(); i++) {
				System.out.println(list1.get(i));
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// function to delete profile
	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id you want to delete");
		String id = sc.nextLine();
		list1.remove(id);
		sc.close();
	}

	// to print list after edit
	public void showEditFile() {
		for (String string : list1) {
			System.out.println(string);
		}
	}

}