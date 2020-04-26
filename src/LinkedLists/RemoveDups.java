/*  
 * Problem
 * =====================
 * Remove Duplicates
 * 
 * Write code to remove duplicates from an unsorted linked list.
 * 
 * How would you solve this problem if a temporary buffer is not allowed?
 * 
 * EXAMPLE
 * =====================
 *
 * 
 * Solution Notes
 * =====================
 * Need a way to track duplicates
 * Once duplicate is found, remove from linked list, and resume
 * 
 */

package LinkedLists;

import java.util.HashSet;

public class RemoveDups {

	// Remove node from List
	// O(N) time, where N is the number of elements in the linked list.
	void routine1(ListNode n)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		ListNode previous = null;
		
		while (n != null) {
			if (set.contains(n.data)) {
				// removes from list
				previous.next = n.next;
			} else {
				// First time find, add to hashtable
				set.add(n.data);
				previous = n;
			}
			
			n = n.next;
		}
	}
	
	// No Buffer use
	// O (1) space, but O(N^2) time.
	void routine2(ListNode head)
	{
		ListNode currentNode = head;
		
		while (currentNode != null) {
			/* Remove all future nodes that have the same value */
			ListNode runner = currentNode;
			
			// Checks all subsequent nodes
			while (runner.next != null) {
				// if next node data equals current node data
				if (runner.next.data == currentNode.data) {
					//remove  node from list, advances to node after
					runner.next = runner.next.next;
				} else {
					
					//Move to next Node
					runner = runner.next;
				}
			}
			
			//Checks next node
			currentNode = currentNode.next;
		}
	}
}
