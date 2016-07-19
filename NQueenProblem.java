package assignment4;

public class NQueenProblem {
	//fuvtion to return output
	int[][] nQueen(int n) {
		int output[][] = new int[n][2];          //outputarray output to store positions of queen
		boolean temp = ifpossible(4, 0, output);
		if (temp) {
			return output;
		} else {
			return new int[0][0];
		}

	}

	boolean ifpossible(int n, int row, int arr[][]) {
		boolean flag;
		if (n == row) // base condition for recursion
		{
			return true;
		}
		/**
         * Returns TRUE if a queen can be placed in row r and column c.
         * Otherwise it returns FALSE. 
         */
		for (int col = 0; col < n; col++) {
			flag = true;
			for (int j = 0; j < row; j++) {
				if (arr[j][0] == row || arr[j][1] == col
						|| arr[j][0] - arr[j][1] == row - col
						|| arr[j][0] + arr[j][1] == row + col) {
					flag = false;
					break;
				}
			}
			if (flag) {
				arr[row][0] = row;
				arr[row][1] = col;
				if (ifpossible(n, row + 1, arr)) {
					return true;
				}
			}
		}
		return false;
	}
}
