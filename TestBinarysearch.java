package assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBinarysearch{
	 Binarysearch bs=new Binarysearch();
	 int arr[]={2,5,8,9,10,77,55};
	@Test
	public void test() {
		assertEquals(1,bs.binarysearch(arr, 0, arr.length-1, 77));
	}

}
