package junit.first;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	CalculatorTest.class,
	Demo1Test.class,
	Demo2Test.class,
	EmployeeTest.class
})

public class JunitTestSuite {

	@Test
	public void test() {
	}

}
