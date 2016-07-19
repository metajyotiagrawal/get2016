package assignment3;

public class Largestdigit {
	// function to find largest digit
	int checklargestdigit(int n, int max) {
		int mod = 0;
		mod = n % 10;
		if (n == 0) {          // to return largest digit
			return max;
		} 
		else if (mod > max){
			max = mod;
			return (checklargestdigit((n / 10), max));
		}
		else {
			return mod;
		}
	}

}
