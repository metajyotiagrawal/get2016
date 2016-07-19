package assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLargestdigit {
	Largestdigit ld=new Largestdigit();

	@Test
	public void test() {
		assertEquals(2,ld.checklargestdigit(2,0));
	}

}
