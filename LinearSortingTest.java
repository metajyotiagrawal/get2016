package DS8;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinearSortingTest {
	LinearSorting obj=new LinearSorting();
	int arr[]={24,75,92,15};
	int expected[]={15,24,75,92};
	//test for counting sort
	@Test
	public void test() {
		assertArrayEquals(expected,obj.countingSort(arr) );
	}
	//test for radix sort
@Test
public void test1(){
	assertArrayEquals(expected, obj.redixSort(arr));
}
}
