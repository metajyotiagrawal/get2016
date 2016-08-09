package DS8;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 * to implement linear sorting
 * counting sort and radix sort
 *
 */
public class LinearSorting {
	HashMap<Integer, LinkedList<Integer>> bucket;   //use map to define keys from 0 to 9 and their values in linked list

	//function to implement counting sort
	public int[] countingSort(int array[]) {
		int max = array[0];
		int output[] = new int[array.length];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		int newArray[] = new int[max + 1];
		for (int j = 0; j < newArray.length; j++) {
			newArray[j] = 0;
		}
		for (int j = 0; j < newArray.length; j++) {
			for (int k = 0; k < array.length; k++) {
				if (array[k] == j) {
					newArray[j] = newArray[j] + 1;
				}
			}
		}
		int k = 0;
		System.out.println("countingsort array");
		for (int i = 0; i < newArray.length; i++) {
			while (newArray[i] != 0) {
				System.out.print(i + " ");
				output[k] = i;
				newArray[i]--;
				k++;
			}
		}
		return output;
	}
	
    //function to implement radix sort
	public int[] redixSort(int array[]) {
		int max = 0;
		int maxDigits = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		//to find number of digits in largest number
		while (max != 0) {
			maxDigits++;
			max /= 10;
		}
		int rdx = 1;
		for (int itr = 0; itr < maxDigits; itr++, rdx *= 10) {
        //to initialize map every time
			bucket = new HashMap<Integer, LinkedList<Integer>>();
			for (int i = 0; i < 10; i++) {
				//to initialize list every time
				LinkedList<Integer> list = new LinkedList<Integer>();
				for (int j = 0; j < array.length; j++) {

					if ((array[j] / rdx) % 10 == i) {
						list.add(array[j]);
					}
				}

				if (!list.isEmpty()) {
					bucket.put(i, list);
				}
			}
			int cnt = 0;
			array = new int[array.length];
			for (int k = 0; k < 10; k++) {
				if (bucket.containsKey(k)) {
					while (!bucket.get(k).isEmpty()) {
						array[cnt] = bucket.get(k).removeFirst();
						cnt++;
					}
				}
			}

		}
		System.out.println("Redix sorted Array ");
		for (int m = 0; m < array.length; m++) {
			System.out.print(array[m] + "  ");
		}
		return array;
	}

	public static void main(String args[]) {
		LinearSorting ls = new LinearSorting();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int size = input.nextInt();
		int[] arr = new int[size];
		int num_digit = 0;
		System.out.println("enter elements");
		for (int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		while (max > 0) {
			int temp = max % 10;
			num_digit = num_digit + 1;
			max = max / 10;
		}
		if (num_digit == 2) {
			ls.countingSort(arr);
		} else {
			ls.redixSort(arr);
		}
	}
}
