package assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculateGCD {
	CalculateGCD gc=new CalculateGCD(); 
	@Test
	public void test() {
		assertEquals(1,gc.gcd(2,1));
		assertEquals(6,gc.gcd(12,18));
		assertEquals(1,gc.gcd(100,3));
		
		
	}

}
