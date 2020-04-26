/*  
 * Problem
 * =====================
 * Rotate Matrix
 * 
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
 * write a method to rotate the image by 90 degrees. 
 * 
 * Can you do this in place?
 * 
 * EXAMPLE
 * =====================
 * Matrix : 3x3
 * A B C --> G D A
 * D E F --> H E B
 * G H I --> I F C
 * 
 * Matrix : 4x4
 * A B C D --> M I E A 
 * E F G H --> N J F B
 * I J K L --> O K G C
 * M N O P --> P L H D
 * 
 * Solution Notes
 * =====================
 * work through points in rings until you reach center.
 * coordinates of 4 sides are determine by current ring/layer, then providing the offsets as you go throw
 * an entire side.
 * 
 * odd: then last pass, no change
 * even: then last pass, has final 4 points moved
 * 
 * 1. swap 0,1 a to 0,3 c
 * 2. swap 0,3 c to 2,2 i
 * 3. swap 2,2 i to 0,0 g
 * 4. swap 0,0 g to 0,1 a
 * 
 */

package arraysAndStrings;

import java.util.Arrays;

public class RotateMatrix {
	
	// This algorithm is O ( N2 ), which is the best we can do since any algorithm must touch all N2 elements.
	char[][] routine1(char[][] matrix)
	{
		
		if (matrix.length== 0 || matrix.length != matrix[0].length) return null;
		
		for ( int layer = 0; layer < matrix.length / 2 ; layer++) {
			
			// current layer start
			int curLayerStart = layer;
			
			// current layer end
			int curLayerEnd = matrix.length - 1 - layer;
			
			// loop for each column in row, until end of layer boundary
			for(int i = curLayerStart; i < curLayerEnd; i++) {
				
				// determine offset away from outer ring ( with every loop, you minus by i to make ringer smaller
				int offset = i - curLayerStart;
				
				// save top
				// Index is my current layer starting row, and current loop column
				char top = matrix[curLayerStart][i]; 
				
				// left side -> top side
				// Index is my last row, and current layer starting row
				matrix[curLayerStart][i] = matrix[curLayerEnd - offset][curLayerStart];
				
				// bottom side -> left side
				// Index is my current layer last row, and my current layer last row.
				matrix[curLayerEnd-offset][curLayerStart] = matrix[curLayerEnd][curLayerEnd - offset];
				
				// right side -> bottom side
				matrix[curLayerEnd][curLayerEnd - offset] = matrix[i][curLayerEnd];
				
				// top side -> right side
				matrix[i][curLayerEnd] = top;// right<- saved top
			}
			
			util.log.consoleLog("Layer: " + layer);
			printMatrix(matrix);
			
		}	
		
		return matrix;
	}

	void rotatePoint(char[][] matrix, int x, int y ){
	
		int size = matrix.length-1;
		
		// upper right
		char upperRight = matrix[x][size-y];
		matrix[x][size-y] = matrix[x][y];
		
		// lower right
		char lowerRight = matrix[size-x][size-y];
		matrix[size-x][size-y] = upperRight;
		
		// lower left
		char lowerLeft = matrix[size-x][y];
		matrix[size-x][y] = lowerRight;
		
		// upper left
		matrix[x][y] = lowerLeft;
		
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
