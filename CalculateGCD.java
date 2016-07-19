package assignment3;

public class CalculateGCD {
	// function to calculate gcd
	int gcd(int x, int y) {
		// check for illegal condition
		if (x == 0 && y == 0) {
			return 0;
		}
		if (x > y) {
			if (x % y == 0) {
				return y;
			} else {
				return (gcd(y, x % y));
			}
		} else if (y % x == 0) {
			return x;
		} else {
			return (gcd(y % x, x));
		}
	}

}
