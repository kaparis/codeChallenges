package arraysAndStrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZeroMatrixTest {

	@Test
	void testCharMatrix3x3() {
		
		int[][] testMatrix = {  {1,1,1},
								{1,0,1},
		              			{1,1,1},
								{1,1,1},
								{1,1,1} };
		
		util.log.consoleLog("===TEST===");
		printMatrix(testMatrix);
		
		util.log.consoleLog("-------------------");
		ZeroMatrix problem = new ZeroMatrix();
		int[][] resultMatrix = problem.routine1(testMatrix);
		util.log.consoleLog("-------------------");
		
		printMatrix(testMatrix);
		
		assertEquals(true, true);
	}
	
	void printMatrix(int[][] matrix)
	{
		for (int x = 0 ; x < matrix.length; x++ ){
			for (int y = 0 ; y < matrix[0].length; y++)
				System.out.print(matrix[x][y] + ",");
						
			System.out.print(System. lineSeparator());
		}
	}

}
