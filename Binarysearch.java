package assignment3;

public class Binarysearch {
	// function for binary search
	int binarysearch(int a[], int ll, int ul, int target) {
		int mid = (ll + ul) / 2; // to calculate mid value
		if (a[mid] == target) {
			return 1;
		}
		if (ll <= ul && a[mid] < target){    /* if target is greater than mid value check left
		                                        portion of array*/
		return (binarysearch(a, mid + 1, ul, target));
		} else if (ll > ul) {                /* if target is smaller than mid value check right
								               portion of array*/
			return (binarysearch(a, ll, mid - 1, target));
		} else {
			return 0;
		}
	}
}
