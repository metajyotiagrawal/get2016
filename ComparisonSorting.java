package DS8;

import java.util.Scanner;
/**
 * class to implement comparison sort
 * bubble sort and quick sort
 *
 */
public class ComparisonSorting {
	public static int array[];

	//method to implement bubble sort
	public void bubbleSort() {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	//method to implement quick sort
	public int[] quickSort(int array[], int start, int end) {
		while (start < end) {
			int index = partition(array, start, end);
			quickSort(array, start, index - 1);           // quicksort the left partition
			quickSort(array, index + 1, end);            // quicksort the right partition
		}
		System.out.println("quick sort array");
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		return array;
	}
/*
 * method that returns exact index of pivot in sorted array
 */
	public int partition(int[] arr, int first, int last) {
		int pivot = arr[last];                     // set the pivot as last element
		int temp = 0;
		while (first < last) {                     //base condition
			while (arr[first] < pivot) {
				first++;

			}
			while (arr[last] > pivot) {
				last--;
			}
			if (last > first) {
				temp = arr[last];
				arr[last] = pivot;
				pivot = temp;
			}
		}
		return last;

	}

	public static void main(String args[]) {
		ComparisonSorting cs = new ComparisonSorting();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int size = input.nextInt();
		array = new int[size];
		System.out.println("enter elements");
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		
		if (size <= 10) {          //to check condition that array size is less or equal to 10 then follow bubble sort
			cs.bubbleSort();
			System.out.println("bubble sort output");
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[j]);
			}
		}
		else {                   //otherwise follow quick sort
			cs.quickSort(array, 0, size-1);
		}
	}
	
}
