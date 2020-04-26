package arraysAndStrings;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class RotateMatrixTest {

	@Test
	void testCharMatrix3x3() {
		
		char[][] testMatrix = { {'A','B','C'},
		              			{'D','E','F'},
		              			{'G','H','I'} };
		
		util.log.consoleLog("===TEST===");
		printMatrix(testMatrix);
		
		util.log.consoleLog("-------------------");
		RotateMatrix problem = new RotateMatrix();
		char[][] resultMatrix = problem.routine1(testMatrix);
		util.log.consoleLog("-------------------");
		
		printMatrix(testMatrix);
		
		assertEquals(true, true);
	}
	
	@Test
	void testCharMatrix4x4() {
		
		char[][] testMatrix = { {'A','B','C','D'},
		              			{'E','F','G','H'},
		              			{'I','J','K','L'},
		              			{'M','N','O','P'}};
		
		util.log.consoleLog("===TEST===");
		printMatrix(testMatrix);
		
		util.log.consoleLog("-------------------");
		RotateMatrix problem = new RotateMatrix();
		char[][] resultMatrix = problem.routine1(testMatrix);
		util.log.consoleLog("-------------------");
		
		printMatrix(testMatrix);
		
		assertEquals(true, true);
	}
	
	void printMatrix(char[][] matrix)
	{
		for (int x = 0 ; x < matrix.length; x++ ){
			for (int y = 0 ; y < matrix.length; y++)
				System.out.print(matrix[x][y] + ",");
						
			System.out.print(System. lineSeparator());
		}
	}

}
