package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class RDAccountTest {

	@Test
	public void testCalculateInterest() {
		RDAccount obj = new RDAccount(32, 18, 10000);
		assertEquals((double)850, obj.calculateInterest(), 0.02);
	}

}
