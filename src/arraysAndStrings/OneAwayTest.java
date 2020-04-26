package arraysAndStrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OneAwayTest {

	@Test
	void testInsert() {
		String start = "ABCDE";
		String end = "ABCD";

		OneAway problem = new OneAway();
		boolean result = problem.routine(start, end);
		System.out.println("Result: " + result);
		assertEquals(true, result);
	}
	
	@Test
	void testRemove() {
		String start = "ABC";
		String end = "AB";

		OneAway problem = new OneAway();
		boolean result = problem.routine(start, end);
		System.out.println("Result: " + result);
		assertEquals(true, result);
	}
	
	@Test
	void testReplace() {
		String start = "ABC";
		String end = "ABZ";

		OneAway problem = new OneAway();
		boolean result = problem.routine(start, end);
		System.out.println("Result: " + result);
		assertEquals(true, result);
	}

}
