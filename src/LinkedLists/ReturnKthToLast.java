/*  
 * Problem
 * =====================
 * Return Kth to Last
 * 
 * Implement an algorithm to find the kth to last element of a singly linked list.
 * 
 * EXAMPLE
 * =====================
 *
 * 
 * Solution Notes
 * =====================
 * 1) If we know the length, then the location is length - kth element
 * You look until you reach the node position
 * 
 * K = 1, is the last element
 * 
 */

package LinkedLists;

public class ReturnKthToLast {
	
	// Recursive approach to get the last element.
	// Prints it and returns its index.
	// Doesn't return the node, so the solution may not be accepted.
	// O(n) space
	int printKthToLast(ListNode head, int k) {
	
		if (head== null) {
			return 0;
		}
		
		int index = printKthToLast(head.next, k) + 1;
		
		if (index == k) {
			System.out.println(k + "th to last node is " + head.data);
		}
		
		return index;
	}
	

}
