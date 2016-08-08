package DS7;
/**
 * class to implement binary search
 * and to find the leftmost position of number in array 
 * it must return zero if number is not found
 *
 */
public class BinarySearch {
	/*
	 * function to find leftmost position of number in array
	 */
	public int findElement(int arr[], int num, int lowerlimit, int upperLimit)
	{
		int mid = (lowerlimit + upperLimit) / 2;
		
		//condition to return -1 if number is not found in array
		if (mid == 0 && arr[mid] != num) {
			System.out.println("-1");
			return -1;
		}
		
		if (arr[mid] == num) {
			if (mid == 0) {                    //if number is found at first position of array
				System.out.println(mid);           //then return its position
				return mid;
			}

			for (int j = mid - 1; j >= 0; j--) {      //loop start from mid-1 position for repetitive 
				if (arr[mid] != arr[j]) {            //elements to find its leftmost position
					System.out.println(j + 1);
					return j + 1;
				} else if (j == 0) {
					System.out.println(j);
					return j;
				}
			}
		} else if (arr[mid] > num) {                //if mid element of array is greater then number
			findElement(arr, num, lowerlimit, mid - 1);
		} else  {                                 //if mid element of array is smaller then number
			findElement(arr, num, mid + 1, upperLimit);
		}
		return -1;
	}

	public static void main(String args[]) {
		int ar[] = { 2, 2, 4, 6, 8 };
		BinarySearch ob = new BinarySearch();
		ob.findElement(ar, 4, 0, 5);
		ob.findElement(ar, 3, 0, 5);
	}

}
