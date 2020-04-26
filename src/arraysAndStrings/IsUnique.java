/**
 * Is Unique
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */
package arraysAndStrings;

/**
 * @author David
 *
 */


// Time Complexity: N2 (loop in loop)
// Space Complexity: ?
public class IsUnique {
	
	public boolean routine1(String input)
	{
		boolean isUnique = true;
		
		for (int i=0;i <= input.length()-1;i++)
		{
			for (int j=i+1; j <= input.length()-1;j++)
			{
				char cur = input.charAt(i);
				char target = input.charAt(j);

				util.log.consoleLog(i+"/"+j+" Current: " + cur + " Target: " + target);
				
				if (cur == target)
				{
					isUnique = false;
					break;
				}
			}
		}
		
		return isUnique;	
	}

	// Time Complexity: O(n)
	// Space Complexity: O(1)
	// Eliminates all cases over 128 characters (ASCII character set only)
	public boolean routine2(String input)
	{
		if (input.length() > 128) return false;
		
		boolean[] char_set = new boolean[128];
		for (int i= 0; i < input.length(); i++) {
			int val= input.charAt(i);
			
			if (char_set[val]) {//Already found this char in string
				return false;
			}
			char_set[val] = true;
		 }
		 return true;
	}
	
	// Time Complexity: 
	// Space Complexity: 
	// assume only lower case a to z
	boolean routine3(String str) {
		int checker = 0;
		
		for (int i= 0; i < str.length(); i++) {
			int val= str.charAt(i) - 'a';
			
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			
			checker |= (1 << val);
		}
		 return true;
	}
	
}
