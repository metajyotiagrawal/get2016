package assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testfile3 {
	assignment3 ls=new assignment3();
	int a[]={1,2,3,4,1,2,3,1,2,3,4,5,6,1,2};
	int b[]={1,2,3,4,5,6};

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
	assertArrayEquals(b,ls.longestSequence(a));	
	}

}
