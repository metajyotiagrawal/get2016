package DS5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
/*
 *  class to create a concordance of characters occurring in a string 
 *  class use HashMap to store characters as Key and
 *  their places of occurence in string as its value
 */

public class ConcordanceString {
	HashMap<Character, ArrayList<Integer>> map = new HashMap<Character, ArrayList<Integer>>();
	String myString;
	Scanner sc = new Scanner(System.in);

	//function to take String from user
	public void getString() {
		System.out.println("enter string");
		myString = sc.nextLine();
	}

	/*
	 * function to find index of individual character in a string 
	 * and stores them in array list
	 */
	public void mapConcordance() {
		for (int i = 0; i < myString.length(); i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
            char ch = myString.charAt(i);
			if (!map.containsKey(ch)) {
				for (int j = 0; j < myString.length(); j++) {
					if (myString.charAt(j) == ch) {
						list.add(j);
					}
				}

				map.put(ch, list);
			}
		}
	}

	public static void main(String args[]) {
		ConcordanceString obj = new ConcordanceString();
		obj.getString();
		obj.mapConcordance();
		System.out.println(obj.map);
	}
}
