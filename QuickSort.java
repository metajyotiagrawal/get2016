package Quicksort;

public class QuickSort {
	// function to quicksort the element in array
	int[] sort(int array[], int start, int end) {
		while (start < end) {
			int index = partition(array, start, end);
			sort(array, start, index - 1);           // quicksort the left partition
			sort(array, index + 1, end);            // quicksort the right partition
		}
		return array;
	}
/*
 * method that returns exact index of pivot in sorted array
 */
	int partition(int[] arr, int first, int last) {
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

}
