package _01_Simple_Array_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatorClassTest {

	@Test
	void testAddition() {
		assertEquals(2, calculatorClassMethods.add(1, 1));
		assertEquals(-12, calculatorClassMethods.add(-3, -9));
		assertEquals(-10, calculatorClassMethods.add(-15, 5));
		assertEquals(10499, calculatorClassMethods.add(10494, 5));
		assertEquals(0, calculatorClassMethods.add(0, 0));
	}

	@Test
	void testAddFloats() {
		assertEquals(2.70000005, calculatorClassMethods.addDouble(2.00000006, 0.7), 0.00000001);
		assertEquals(4.3, calculatorClassMethods.addDouble(4, 0.3));
	}
}
