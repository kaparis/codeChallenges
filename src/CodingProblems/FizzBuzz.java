/* CODE CHALLENGE
 * ==============
 * Write a program that prints the numbers from 1 to 100. But for multiples of 
 * three print �Fizz� instead of the number and for the multiples of five print 
 * �Buzz�. For numbers which are multiples of both three and five print �FizzBuzz�.
 */

package CodingProblems;

public class FizzBuzz {
	
	public StringBuilder run1(int length, int fizzNumber, int buzzNumber )
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<=length;i++)
		{
			if (i % fizzNumber == 0 && i % buzzNumber != 0)
				sb.append("Fizz");
			else if (i % fizzNumber == 0 && i % buzzNumber != 0)
				sb.append("Buzz");
			else if (i % fizzNumber == 0 && i % buzzNumber == 0)
				sb.append("FizzBuzz");
			else
				sb.append(i);
			
			sb.append("\n");
		}
		
		return sb;
	}
	
	public StringBuilder run2(int length, int fizzNumber, int buzzNumber)
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<=length;i++)
		{
			if (i % fizzNumber == 0)
				sb.append("Fizz");
			if (i % buzzNumber == 0)
				sb.append("Buzz");
			if (i % fizzNumber != 0 && i % buzzNumber != 0)
				sb.append(i);
			
			sb.append("\n");
		}
		
		return sb;
	}

}
