package mainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class concTest {

	@Test
	public void concTest() {
		MyJUnitClass jclass = new MyJUnitClass();
		String results = jclass.concat("hola ", "gringo");
		
		assertEquals("hola gringo", results);
	}

}
