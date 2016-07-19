package assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRecursionRemainder {
	RecursionRemainder rs=new RecursionRemainder();
	
	@Test (expected=IllegalArgumentException.class)
	public void test() {
		assertEquals("",rs.remainder(2,0));
	}
	@Test
	public void testremainder()
	{
		assertEquals("1",rs.remainder(2,1));
	}
	@Test
	public void testremainder1()
	{
		assertEquals("1",rs.remainder(100,3));
	}

}
