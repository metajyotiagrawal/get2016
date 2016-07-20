package oopsassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixTest {
	
Matrix obj=new Matrix(3,3);
Matrix obj1=new Matrix(3,3);
int value[][] = { { 1, 2, 3 }, { 3, 4, 5 }, { 7, 8, 9 } };
int expected[][]={{1,3,7},{2,4,8},{3,5,9}};
int value1[][]= { { 1, 2, 1 }, { 2, 4, 1 }, { 1, 3, 2 } };
int expected1[][]={{8,19,9},{16,37,17},{32,73,33}};
	@Test
	public void test() {
		obj.getMatrix(value, obj);
		assertArrayEquals(value, obj.mat);
		obj.transpose(obj);
		assertArrayEquals(expected, obj.mat);
		obj.getMatrix(value, obj);
		obj1.getMatrix(value1, obj1);
		assertArrayEquals(expected1, (obj.multiplication(obj, obj1)).mat);
		
	}
}
