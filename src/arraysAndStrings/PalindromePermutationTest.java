package arraysAndStrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromePermutationTest {
	
	@Test
	void testEmptyValue() {
		String value = "";

		PalindromePermutation problem = new PalindromePermutation();
		boolean result = problem.isPermutationOfPalindrome(value);
		System.out.println("Result: " + result);
		assertEquals(true, result);
	}
	
	@Test
	void testEvenLength() {
		String value = "abba";

		PalindromePermutation problem = new PalindromePermutation();
		boolean result = problem.isPermutationOfPalindrome(value);
		System.out.println("Result: " + result);
		assertEquals(true, result);
	}
	
	@Test
	void testOddLength() {
		String value = "ab ba";

		PalindromePermutation problem = new PalindromePermutation();
		boolean result = problem.isPermutationOfPalindrome(value);
		System.out.println("Result: " + result);
		assertEquals(true, result);
	}
	
	@Test
	void testOddLength2() {
		String value = "abiba";

		PalindromePermutation problem = new PalindromePermutation();
		boolean result = problem.isPermutationOfPalindrome(value);
		System.out.println("Result: " + result);
		assertEquals(true, result);
	}
	
	@Test
	void testNotPalindrome() {
		String value = "abiba giberish";

		PalindromePermutation problem = new PalindromePermutation();
		boolean result = problem.isPermutationOfPalindrome(value);
		System.out.println("Result: " + result);
		assertEquals(false, result);
	}

}
