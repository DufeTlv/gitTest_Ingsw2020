package mainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumTest {

	@Test
	public void sumTest() {
		MyJUnitClass jclass = new MyJUnitClass();
		int results = jclass.sum(50, 55);
		
		assertEquals(105, results);
	}

}
