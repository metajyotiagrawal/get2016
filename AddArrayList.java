package ds1;

import java.util.Scanner;
//class to add to arraylist


public class AddArrayList {

	void mergeList(ArrayList<Integer> first, ArrayList<Integer> second) {
	

		int secondSize = second.count - 1;
		for (int i = 0; i <= secondSize; i++) {
			first.add(second.get(i));
		}

	}

	public static void main(String ar[]) {

		ArrayList<Integer> first = new ArrayList<Integer>();
		ArrayList<Integer> second = new ArrayList<Integer>();
		System.out.println("How many element you want to display in first Array list");
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter value:");
			first.add(sc.nextInt());
		}

		first.display();

		System.out.println("How many element you want to display in Second Array list");
		sc = new Scanner(System.in);

		size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter value:");
			second.add(sc.nextInt());
		}
		AddArrayList merger = new AddArrayList();
		merger.mergeList(first, second);

		first.display();

	}

}
