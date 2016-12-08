package codeChallenges;

import java.io.Console;

public class main {

	public static void main(String[] args) {
		
		long startTime;
		long endTime;
		StringBuilder sb;
		final int length = 10000;
		final int fixNumber = 3;
		final int buzzNumber = 5;
		
		FizzBuzz fb = new FizzBuzz();
		
		startTime = System.currentTimeMillis();
		sb = fb.run1(length, fixNumber, buzzNumber);
		System.out.print(sb);
		endTime = System.currentTimeMillis();
		
		System.out.println("Run 1 Execution time(ms): " + (endTime - startTime) );
		
		
		
		
		startTime = System.currentTimeMillis();
		sb = fb.run2(length, fixNumber, buzzNumber);
		System.out.print(sb);
		endTime = System.currentTimeMillis();
		
		System.out.println("Run 2 Execution time(ms): " + (endTime - startTime) );
	}

}
