package PFassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PFtestcase2 {
	assignment2 assign=new assignment2();
	
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
		String[] expected = {"12345"," 1234","  123","   12","    1"};
		assertEquals("", assign.spaces(5));
		assertEquals(" ",assign.spaces(4));
        assertEquals("  ",assign.spaces(3));
		assertEquals("   ",assign.spaces(2));
		assertEquals("    ",assign.spaces(1));
		assertEquals("12345",assign.number(5));
		assertEquals("1234",assign.number(4));
		assertEquals("123",assign.number(3));
		assertEquals("12",assign.number(2));
		assertEquals("1",assign.number(1));
		assertArrayEquals(expected, assign.printwholepyramid(5));
		
	}

}
