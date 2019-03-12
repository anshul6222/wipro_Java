package test;

import static org.junit.Assert.*;

import org.junit.Test;


public class FDAccountTest {

	@Test
	public void testCalculateInterest() {
		FDAccount obj = new FDAccount(10000, 95, 62);
		assertEquals((double)800, obj.calculateInterest(), 0.02);
	}

}
