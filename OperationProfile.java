package OOPS5;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * class is used to remove and show profile from arraylist list1 
 * delete method is used to delete profile
 * showEditProfile method is used print edit list
 * @author jyoti
 *
 */
public class OperationProfile  {
		private String line;
		private String count;
		private static ArrayList<String> list1=new ArrayList<String>();
		private static String arr[]=new String[10]; 
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
		//function to show profiles on console
		public void show(){
			try {
				FileInputStream fstream = new FileInputStream(
						"c:/users/admin/workspace/profiledata.txt");
				// Get the object of DataInputStream
				DataInputStream fs = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(fs));
				Scanner s = new Scanner(new File("c:/users/admin/workspace/profiledata.txt"));
				String line;
				int j=0;
	              while (s.hasNext()){
	            	  line=s.nextLine();
	            	    list1.add(line);
	            	    String str[]=list1.get(j).split(" ");
	            	    arr[j]=str[1];
	            	    j++;
	            	}
	            	s.close();
	            	for(int i = 0; i < list1.size(); i++) {   
	            	    System.out.println(list1.get(i));
	            	}  
	            	
				 }catch (IOException e) {                     
				e.printStackTrace();
			}
		}
		//function to delete profile
	public void delete() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id you want to delete");
		String id=sc.nextLine();
		list1.remove(id);
	}
//to print list after edit 
	public void showEditFile() {
		for (String string : list1) {
			System.out.println(string);
		}
	}

	public static void setList1(ArrayList<String> list1) {
		OperationProfile.list1 = list1;
	}
	
	
}
