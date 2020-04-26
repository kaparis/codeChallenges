/*  
 * Problem
 * =====================
 * String Compression
 * 
 * Implement a method to perform basic string compression using the counts of 
 * repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. 
 * If the "compressed" string would not become smaller than the original string, 
 * your method should return the original string. 
 * 
 * You can assume the string has only uppercase and lowercase letters (a - z).
 * 
 * EXAMPLE
 * =====================
 * aabcccccaaa --> a2b1c5a3
 * 
 * Solution Notes
 * =====================
 * count letter that are in sequence
 * if new string is shorter in length, then return original string
 * 
 */

package arraysAndStrings;

public class StringCompression {
	
	// The runtime is O(p + k2 ), where p is the size of the original string and k is the number of character sequences.
	// string concatenation operates in O(n2)
	String routine(String str )
	{	
		String compressed = new String();
		char letterCompress = str.charAt(0);
		int letterCount = 0 ;
	
		
		int i = 0;
		do {
			if ( str.charAt(i) != letterCompress ) {
				compressed += (letterCompress + Integer.toString(letterCount));
				letterCompress = str.charAt(i);
				letterCount = 1;	
			} 
			else
				letterCount++;
			
			if (i + 1 == str.length()){
				// last character / build compressed string
				compressed += (letterCompress + Integer.toString(letterCount));
			}
			
			i++;
		} while ( i < str.length());
		
		// smaller string returned
		compressed = str.length() < compressed.length() ? str : compressed;
		
		return compressed;

	}
	
	// The runtime is O(p * k^2 ), where p is the size of the original string and k is the number of character sequences.
	// use string builder which only doubles every time.
	// faster 
	String routine2(String str )
	{			
		StringBuilder compressed = new StringBuilder();
		char letterCompress = str.charAt(0);
		int letterCount = 0 ;
		
		int i = 0;
		do {
			if ( str.charAt(i) != letterCompress ) {
				compressed.append(letterCompress + Integer.toString(letterCount));
				letterCompress = str.charAt(i);
				letterCount = 1;	
			} 
			else
				letterCount++;
			
			if (i + 1 == str.length()){
				// last character / build compressed string
				compressed.append(letterCompress + Integer.toString(letterCount));
			}
			
			i++;
		} while ( i < str.length());
		
		return str.length() < compressed.length() ? str : compressed.toString();
	}
}
