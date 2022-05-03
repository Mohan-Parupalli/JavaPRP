package junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		assertEquals(5,c.add(2, 3));
		//fail("Not yet implemented");
	}

	@Test
	public void testSub() {
		Calculator c=new Calculator();
		assertEquals(20,c.sub(100, 80));
		//fail("Not yet implemented");
	}

}
