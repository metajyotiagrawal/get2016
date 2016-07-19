package assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLinearsearch {
	Linearsearch ls=new Linearsearch();
	int arr[]={2,5,8,9,10,77,55};
	int arr1[]={2,5,8,9,10,55,77};

	@Test
	public void test() {
	assertEquals(0,ls.linearsearch(arr,88,0));
	assertEquals(1,ls.linearsearch(arr1,77,0));
	
	
	
	}

}
