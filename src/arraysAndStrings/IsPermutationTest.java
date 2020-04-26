package arraysAndStrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsPermutationTest {

	@Test
	void testIsPermutationGoodCase() {
		IsPermutation routine = new IsPermutation();
		
		String strA = "Bob";
		String strB = "Bob";
		
		boolean result = routine.isPermutation(strA, strB);
		
		assertEquals(true, result);
	}
	
	@Test
	void testIsPermutationDifferentStringLength() {
		IsPermutation routine = new IsPermutation();
		
		String strA = "Bob";
		String strB = "Bob2";
		
		boolean result = routine.isPermutation(strA, strB);
		
		assertEquals(false, result);
	}
	
	@Test
	void testIsNotPermutation() {
		IsPermutation routine = new IsPermutation();
		
		String strA = "Bob";
		String strB = "Joe";
		
		boolean result = routine.isPermutation(strA, strB);
		
		assertEquals(false, result);
	}
}
