/*  
 * Problem
 * =====================
 * String Rotation
 * 
 * Assume you have a method isSubstring which checks if one word is a substring of another. 
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
 * call to isSub5tring 

 * 
 * EXAMPLE
 * =====================
v
 * 
 * Solution Notes
 * =====================
 * 
 * 
 */

package arraysAndStrings;

public class StringRotation {
	
	
	// If isSubstring runs in O(A+B) time (on strings of length A and B)
	// then the runtime of is Rotation is O(N).
	boolean routine1(String sl, String s2) {
		int len = sl.length();
		
		/* Check that sl and s2 are equal length and not empty*/
		if (len == s2.length() && len > 0) {
			/* Concatenate s1 and s1 within new buffer */
			String s1s1 = sl + sl;
			
			return isSubstring(s1s1, s2);
		}
		
		return false;
	}

	
	boolean isSubstring(String s1s1, String s2)
	{
		return s1s1.indexOf(s2) != -1;
		
	}
}
