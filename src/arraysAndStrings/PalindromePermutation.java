/*  
 * Problem
 * Palindrome Permutation
 * 
 * Given a string, write a function to check if it is a permutation of palindrome. 
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters. 
 * The palindrome does not need to be limited to just dictionary words.
 * 
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat'; "atco cta;)
 * 
 * Solution Notes
 * If we count each character in the string that follow the two following rules,
 * we can determine its a permuation of a palindrome
 * 
 * string with a even length, must have character counts of even length
 * string with odd length, must have only 1 character of odd length
 * 
 * Remember, palindrome is not case sensitive
 * 
 *  */

package arraysAndStrings;

public class PalindromePermutation {
	
	// problem: Checks if the string is a Palindrome, but not if its a permutation of one.
	boolean routine1(String str) {
		
		boolean result = true;
		int e = str.length()-1;
		for( int s = 0 ; s < str.length() & s < e & result; s++, e--)
		{
			if ((e-s) != 1)
			{
				if (str.charAt(s) != str.charAt(e))
					result = false;
			}	
		}
		
		return result;
	}
	
	
	boolean isPermutationOfPalindrome(String phrase) {
		int[] table = buildCharFrequencyTable(phrase);
		
		return checkMaxOneOdd(table);
	}
	
	/* Check that no more than one character has an odd count. */
	boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for (int count : table) {
			if (count % 2 == 1) {
				if (foundOdd) {
					// found a second odd, not a permutation
					return false;
				}
				foundOdd = true;
		 	}
	 	}
	 	return true;
	}
	
	/* Count how many times each character appears. */
	int[] buildCharFrequencyTable(String phrase) {
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		
		for (char c : phrase.toCharArray()) 
		{
			int x = getCharNumber(c);	
			if (x != -1) {
				table[x]++;
			}
		}
		
		return table;
	}
	
	/* Map each character to a number. a -> 0, b -> 1, c -> 2, etc.
	* This is case insensitive. Non-letter characters map to -1. */
	int getCharNumber(Character c) {
		int a= Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val= Character.getNumericValue(c);
		if (a<= val && val<= z) {
			return val - a;
		}
		
		return -1;
	}
}
