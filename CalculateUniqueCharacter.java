package ds6;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/**
* DS assignment 6  
* problem 2
* Class CalculateUniqueCharacter have method to calculates unique characters in a given string 
* and if same string is entered 2nd time then it will directly give the previous calculated output without calculating again
*/
public class CalculateUniqueCharacter {
HashMap<String, ArrayList<Character>> UniqueStrMap = new HashMap<String, ArrayList<Character>>();

	int exit = 1;

	public void findUniqueCharacter() throws Exception {
		
		while (exit != 0) {
			Scanner sc = new Scanner(System.in);
			ArrayList<Character> uniqueCharArray = new ArrayList<Character>();

			System.out.println("enter a string");
			
			String inputString = sc.nextLine();
			if (!UniqueStrMap.containsKey(inputString)) {
				for (int i = 0; i < inputString.length(); i++) {

					char ch = inputString.charAt(i);
					int cnt = 0;
					for (int j = 0; j < inputString.length(); j++) {
						if (ch == inputString.charAt(j)) {
							cnt++;
						}
					}

					if (cnt == 1) {
						uniqueCharArray.add(ch);
					}

				}
				System.out
						.println("unique characters in string " + inputString);
				for (int n = 0; n < uniqueCharArray.size(); n++) {
					System.out.print(uniqueCharArray.get(n) + ", ");
				}
				System.out.println();
				UniqueStrMap.put(inputString, uniqueCharArray);
			} else {
				System.out
						.println("unique characters in string " + inputString);
				System.out.println(UniqueStrMap.get(inputString));
			}
			System.out.println("enter 0 to exit");
			exit = sc.nextInt();
		}
	}

	public static void main(String args[]) throws Exception {

		CalculateUniqueCharacter ob = new CalculateUniqueCharacter();
		ob.findUniqueCharacter();

	}
}
