package junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void testPalindrome() {
		Demo2 obj = new Demo2();
		assertEquals("Palindrome", obj.palindrome("MadaM") );
		assertEquals("Not Palindrome", obj.palindrome("Madams"));
	}

}
