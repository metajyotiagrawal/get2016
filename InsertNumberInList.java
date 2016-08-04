package DS5;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * class to insert numbers in LinkList in sorted manner
 * maintaining ascending order
 */
public class InsertNumberInList {

	Scanner sc = new Scanner(System.in);
	public static LinkedList<Integer> lnkList = new LinkedList<Integer>();
	int exit;

	// function to insert number in LinkList in sorted manner
	public void insertNumber(int num) {
		for (int i = 0; i < lnkList.size(); i++) {
			int temp = lnkList.get(i);
			if (temp > num) {                 // to find position at which number is to be added
				lnkList.add(i, num);
				break;
			}
		}
		lnkList.add(num);
		System.out.println("Enter 0 to exit");
		exit = sc.nextInt();
		while (exit != 0) {                    // infinite loop to take input from user
			insertNumber(getNumber());
		}
	}

	// function to get number from user
	public int getNumber() {
		System.out.println("Enter number to be added");
		int n = sc.nextInt();
		return n;
	}

	// function to display sorted LinkList
	public void DisplayList() {
		System.out.println("Soted linkedlist is:");
		for (int i = 0; i < lnkList.size() - 2; i++) {
			System.out.println(lnkList.get(i));
		}
	}

	public static void main(String args[]) {
		InsertNumberInList obj = new InsertNumberInList();
		obj.lnkList.add(3);
		obj.insertNumber(4);
		obj.DisplayList();
	}

}
