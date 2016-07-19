package assignment4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPermutation {
	Permutation cp=new Permutation();
	String s="ABC";
String expected[]={"ABC","ACB","BAC","BCA","CBA","CAB"};
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
		assertArrayEquals(expected, cp.calculatepermutation(s, 2,0,0));
	}

}
