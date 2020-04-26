/*  
 * Problem
 * =====================
 * Zero Matrix
 * 
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 * 
 * EXAMPLE
 * =====================
 * 
 * Matrix : 4x4
 * 1 1 1 1 --> 1 0 1 1
 * 1 0 1 1 --> 0 0 0 0
 * 1 1 1 1 --> 1 0 1 1
 * 1 1 1 1 --> 1 0 1 1
 * 1 1 1 1 --> 1 0 1 1
 * 
 * Solution Notes
 * =====================
 * Remember that once its set to zero, not to look at that zero and determine the row/col also needs to be
 * zeroed out. This results in a all zero matrix.
 * 
 */
package arraysAndStrings;

public class ZeroMatrix {
	
	// O(MN) space.
	int[][] routine1(int[][] matrix)
	{
		boolean[] row = new boolean[matrix .length];
		boolean[] column = new boolean[matrix[0].length];
		
		//Store the row and column index with value 0
		for (int i= 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length;j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		// Nullify rows
		for (int curRow= 0; curRow < row.length; curRow++) {
			if (row[curRow])
			{
				for (int colNum = 0; colNum < matrix[0].length; colNum++) {
					matrix[curRow][colNum] = 0;
				}
			}
		}
		
		// Nullify columns
		for (int curCol = 0; curCol < column.length; curCol++) {
			if (column[curCol]) 
			{
				for (int rowNum= 0; rowNum < matrix.length; rowNum++) {
					matrix[rowNum][curCol] = 0;
				}
			}
		}
		
		return matrix;
	}

}
