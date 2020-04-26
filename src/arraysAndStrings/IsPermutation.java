/*
 * Problem
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 * 
 * Questions
 * - Is this case sensitive? No
 * - Is white space significant? No
 */


package arraysAndStrings; 

//Time Complexity: ?
//Space Complexity: ?
public class IsPermutation {
	
	boolean isPermutation(String a, String b)
	{
		boolean result = false;
		
		char[] aChar = a.toCharArray();
		java.util.Arrays.sort(aChar);
		String aSorted = new String(aChar);
		
		char[] bChar = b.toCharArray();
		java.util.Arrays.sort(bChar);
		String bSorted = new String(bChar);
		
		if (aSorted.length() == bSorted.length())
		{
			if (aSorted.equals(bSorted))
				result = true;
		}
		
		util.log.consoleLog(aSorted.toString() + ":" + bSorted.toString() + "--> " + result);
		
		return result;
	}
	
	
	// Second approach is to make a assumption that the text is ASCII with with 128 characters. 
	// Create a char array of 128 size to count each letter in first word. Then make a second pass to compare the second string
	
	
}
