package OOPS3;
/**
 * to initialize grid
 * to show current state of grid
 * to set and get grid
 */
public class State {
	private static char grid[][];

	/*
	 * return the grid
	 */
	public static char getGrid(int row,int col) {
		return grid[row][col];
	}

	/*
	 * set the state of grid
	 */
	public static void setGrid(int row, int col, char symbol) {
		State.grid[row][col] = symbol;
	}

	/*
	 * function to make grid empty
	 */
	public static void makeGridEmpty() {
		grid = new char[3][3];
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				grid[row][col] = ' ';
			}
		}
	}

	/*
	 *  function to print current state of grid
	 */
	public static void showgrid() {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print("|" + grid[row][col]);

			}
			System.out.println("");

			System.out.println("-----------");

		}
	}

	/*
	 *  to check output of grid
	 */
	public static void main(String args[]) {
		State s = new State();
		s.makeGridEmpty();
		s.getGrid(0,1);
		s.setGrid(2, 2, '*');
		s.setGrid(1, 2, '*');
		s.showgrid();
	}
}
