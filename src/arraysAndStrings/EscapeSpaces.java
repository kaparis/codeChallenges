/*  
 * Problem
 * URLify: Write a method to replace all spaces in a string with '%20'. 
 * 
 * Assumption: The string has sufficient space at the end to hold the additional characters
 * Assumption : You are given the "true" length of the string. 
 * Note: Use a character array so that you can perform this operation in place.
 * 
 * EXAMPLE
 * Input: "Mr John Smith"
 * Output: "Mr%20John%20Smith"
 */

package arraysAndStrings;

public class EscapeSpaces {
	
	void escapeSpaces(char[] str, int strLength)
	{
		int spaceCount = 0;
		for (int i=0; i < strLength; i++)
		{
			if (str[i] == ' ')
				spaceCount++;
		}
		
		// get new array size of 2 additional elements for every space found
		int index = strLength + spaceCount * 2;
		
		if (strLength < str.length) 
			str[strLength] = '\0'; // End array
		
		//loop backwards to replace spaces
		for (int j = strLength - 1; j >= 0; j-- ) 
		{
			if (str[j] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				
				index = index - 3;
			} else 
			{
				str[index - 1] = str[j];
				index--;
			}
		}
	}

}
