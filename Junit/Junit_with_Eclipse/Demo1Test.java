package junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1Test {

	@Test
	public void testStringConcat() {
		Demo1 obj = new Demo1();
		assertEquals("helloworld", obj.stringConcat("hello", "world"));
	}

}
