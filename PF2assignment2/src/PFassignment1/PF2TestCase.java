package PFassignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PF2TestCase {
	Pyramid1 assign=new Pyramid1();

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
		String result[]={"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
		//check for spaces
		assertEquals("    ",assign.spaces(1,5));
		assertEquals("   ",assign.spaces(2,5));
		assertEquals("  ",assign.spaces(3,5));
		assertEquals(" ",assign.spaces(4,5));
		assertEquals("",assign.spaces(5,5));
		assertEquals(" ",assign.spaces(6,5));
		assertEquals("  ",assign.spaces(7,5));
		assertEquals("   ",assign.spaces(8,5));
		assertEquals("    ",assign.spaces(9,5));
		//check for numbers
		assertEquals("1",assign.number(1,5));
		assertEquals("121",assign.number(2,5));
		assertEquals("12321",assign.number(3,5));
		assertEquals("1234321",assign.number(4,5));
		assertEquals("123454321",assign.number(5,5));
		assertEquals("1234321",assign.number(6,5));
		assertEquals("12321",assign.number(7,5));
		assertEquals("121",assign.number(8,5));
		assertEquals("1",assign.number(9,5));
		//check for pyramid
		assertArrayEquals(result,assign.printwholepyramid(5));
		
		
	}

}
