package assignment6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testfile6 {
	assignment6 rs=new assignment6();
	int a[]={1,3,5,7};
	int b[]={2,4,6,9};
	int c[]={1,2,3,4,5,6,7,9};
	

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
	assertArrayEquals(c,rs.join(a,a.length,b,b.length,c));
	}

}
