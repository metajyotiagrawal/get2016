package oopsassignment;

public class Matrix {
	int mat[][];
	int row; // number of rows
	int column; // number of columns
	int i, j;

	// constructor to initialize variable
	public Matrix(int rw, int col) {
		this.row = rw;
		this.column = col;
		mat = new int[rw][col];
	}

	// fuction to add elements in matrix
	public void addElements(int rw, int col, int value) {
		mat[rw][col] = value;
	}

	public void getMatrix(int arr[][], Matrix matr) {
		for (int i = 0; i < matr.row; i++) {
			for (int j = 0; j < matr.column; j++) {
				matr.addElements(i, j, arr[i][j]);
			}
		}
	}

	// fuction to transpose matrix
	public void transpose(Matrix mt) {
		int trans[][] = new int[mt.column][mt.row];
		for (i = 0; i < mt.row; i++) {
			for (j = 0; j < mt.column; j++) {
				trans[i][j] = mt.mat[j][i];
			}
		}
		mt.mat = trans;
	}

	// function to diplay matrix
	public void show(Matrix m) {
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print(m.mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public Matrix multiplication(Matrix m1, Matrix m2) {
		Matrix mtx=new Matrix(m1.row,m2.column);
		int multi[][] = new int[m1.row][m2.column];
		if (m1.row == m2.column) {
			for (i = 0; i < m1.row; i++) {
				for (j = 0; j < m2.column; j++) {
					multi[i][j] = 0;
					for (int k = 0; k < m1.column; k++) {
						multi[i][j] = multi[i][j] + m1.mat[i][k] * m2.mat[k][j];
					}
				}
			}
		}
		mtx.mat=multi;
		return mtx;
	}

	// main function
	public static void main(String args[]) {
		Matrix ob = new Matrix(3, 3);
		int value[][] = { { 1, 2, 3 }, { 3, 4, 5 }, { 7, 8, 9 } };
		Matrix ob1 = new Matrix(3, 3);
		int value1[][] = { { 1, 2, 1 }, { 2, 4, 1 }, { 1, 3, 2 } };
		ob.getMatrix(value, ob);
		System.out.print("Input matrix is:");
		System.out.println();
		ob.show(ob);
		ob.transpose(ob);
		System.out.print("Transpose matrix is:");
		System.out.println();
		ob.show(ob);
		ob.getMatrix(value, ob);
		ob.getMatrix(value1, ob1);
		Matrix mult = ob.multiplication(ob,ob1);
		System.out.println("multiplication of matrix:");
		mult.show(mult);
	}
}
