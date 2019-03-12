package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	FDAccountTest.class,
	SBAccountTest.class,
	RDAccountTest.class
	
})

public class SuiteTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
