package junit.first;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {
	
	static Employee obj = null;
	
	@BeforeClass
	public static void before() {
		 obj = new Employee();
	}

	@Test
	public void test() {
		   ArrayList<String> list = new ArrayList<>();
		   list.add("Abhijay");
		   list.add("Anuj");
		   list.add("Abhish");
		   	assertEquals("FOUND", obj.findName(list, "Abhish"));	
		   
	}

}
