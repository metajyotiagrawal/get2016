package Quicksort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestQuickSortTest {
	QuickSort qc=new QuickSort();
	int arr[]={2,5,9,4,6,3};
	int expected_array[]={2,3,4,5,6,9};

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertArrayEquals(expected_array,qc.sort(arr,0,arr.length-1));
	}

}
