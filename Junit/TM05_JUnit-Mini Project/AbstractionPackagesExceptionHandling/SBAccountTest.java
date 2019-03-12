package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SBAccountTest {

	@Test
	public void testCalculateInterest() {
		SBAccount obj = new SBAccount("Normal", 10000);
		assertEquals((double)400, obj.calculateInterest(), 0.02);
	}

}
