/*  
 * Problem
 * =====================
 * One Away
 * 
 * There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check 
 * if they are one edit (or zero edits) away.
 * 
 * EXAMPLE
 * =====================
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bae -> false
 * 
 * Solution Notes
 * =====================
 * insert:
 * 	1 char more
 * 	same source characters and order
 * remove:
 * 	1 char less
 * 	same source character and order
 * replace: 
 *  same length
 * 	same source character order
 * 
 */

package arraysAndStrings;

public class OneAway {
	
	// O(n) run time
	boolean routine(String f, String s )
	{
		boolean result = false;
	
		/* Length checks. */
		if (Math.abs(f.length() - s.length()) > 1) {
			return false;
		}
		
		if ( f.length() == s.length()) {
			return oneEditReplace(f,s);
		} else if (f.length() + 1 == s.length()) {
			return oneEditInsert(f,s);
		} else if ( f.length() - 1 == s.length()) {
			return oneEditInsert(f,s);
		}
		
		return result;
	}
	
	// If more than one difference is found, then return false
	boolean oneEditReplace(String s1, String s2)
	{
		boolean foundDifference = false;
		
		for (int i= 0; i < s1.length(); i++) {
			
			if (s1.charAt(i) != s2.charAt(i)) {
				if (foundDifference) {
					return false;
				}
				
				foundDifference = true;
			}
		}
		
		return foundDifference;
	}
	
	// Check if you can insert a character into s1 to make s2.
	boolean oneEditInsert(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		
		while (index1 < s1.length() && index2 < s2.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (index1 != index2) {
					// second difference found, return false
					return false;
				}
				index2++;
				// moved to next index of string
			} else {
				// no difference found, move forward in both strings
				index1++;
				index2++;
			}
		}
		return true;
	}
}
