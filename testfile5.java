package assisgnment5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testfile5 {
	assignment5 cs=new assignment5();
	int a[]={1,2,3,4};
	int b[]={8,5,4,3};
	int c[]={1,4,9,5};

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
		assertEquals(1,cs.check_Sorted(a));
		assertEquals(2,cs.check_Sorted(b));
		assertEquals(0,cs.check_Sorted(c));
	}

}
