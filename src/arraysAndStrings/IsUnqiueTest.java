package arraysAndStrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsUnqiueTest {

	@Test
	void isUnique () {
		String value = "Test";

		IsUnique problem = new IsUnique();
		boolean result = problem.routine1(value);
		System.out.println("Result: " + result);
		assertEquals(true, result);
	}
	
	@Test
	void isUniqueDupilicate () {
		String value = "TestATestA";

		IsUnique problem = new IsUnique();
		boolean result = problem.routine1(value);
		System.out.println("Result: " + result);
		assertEquals(false, result);
		
	}
	
	@Test
	void isNotUnique() {
		String value = "TesT";
		IsUnique problem = new IsUnique();
		boolean result = problem.routine1(value);
		System.out.println("Result: " + result);
		assertEquals(false, result);
	}
	
	@Test
	void oneCharacter() {
		String value = "T";
		IsUnique problem = new IsUnique();
		boolean result = problem.routine1(value);
		System.out.println("Result: " + result);
		assertEquals(true, result);
	}
	
	@Test
	void isUniqueTwoCharacter() {
		String value = "Ta";
		IsUnique problem = new IsUnique();
		boolean result = problem.routine1(value);
		System.out.println("Result: " + result);
		assertEquals(true, result);
	}
	
	@Test
	void isNotUniqueTwoCharacter() {
		String value = "TT";
		IsUnique routine = new IsUnique();
		boolean result = routine.routine1(value);
		System.out.println("Result: " + result);
		assertEquals(false, result);
	}
}
