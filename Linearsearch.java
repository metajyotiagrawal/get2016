package assignment3;

public class Linearsearch {
	//fuction for linearsearch
	int linearsearch(int a[], int target, int index) {
		int constant=0;
		if (index >= a.length) {
			return constant;
		}
		if (a[index] == target) {
			return constant+1;
		} 
		 
		if(index < a.length) {
			return linearsearch(a, target, ++index);
		}
		else{
			return 0;
		}
	}
}
