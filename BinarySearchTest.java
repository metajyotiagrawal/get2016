package DS7;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {
	int array[] = { 3, 5, 5, 7, 9 };
	BinarySearch obj = new BinarySearch();

	@Test
	public void test() {
		//to check element 5 which is present at 1 position
		assertEquals(1, obj.findElement(array, 5, 0, array.length));
	}

	@Test
	public void test1() {
		//to check condition when number is not present in array
		assertEquals(-1, obj.findElement(array, 2, 0, array.length));
	}
}
