/*
 * Problem
 * =====================
 * Partition
 *
 * Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes
 * greater than or equal to x.
 *
 * If x is contained within the list, the values of x only need to be after the elements
 * less than x (see below). The partition element x can appear anywhere in the "right partition";
 * it does not need to appear between the left and right partitions.
 *
 * IMPORTANT: The partition element x can appear anywhere in the “right partition”;
 *
 * Example
 * =====================
 * Input: 	3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5]
 * Output: 	3 -> 1 -> 2       ->        10 -> 5 -> 5 -> 8"
 *
 * Solution Notes
 * =====================
 * Tip: Don't think of this as sorted linked list.
 *

 */
package LinkedLists;

public class Partition {

    public ListNode routine1(ListNode node, int partitionValue) {
        // loop through nodes
        // place less than nodes in one new node list
        // place more than nodes in one new node list
        // link next node as they are identified

        ListNode leftListHead = null;
        ListNode leftListTail = null;
        ListNode rightListHead = null;
        ListNode rightListTail = null;

        while (node != null) {
            ListNode next = node.next;
            node.next = null;

            if (node.data < partitionValue) {
                if (leftListHead == null) {
                    // Only on first node add to list, assign as head node and identify tail node.
                    leftListHead = node; // assigns current node as head node
                    leftListTail = leftListHead; // assigns
                } else {
                    // Only on 2nd node and on, assign tail node next to the current node, and point to tail node to new tail.
                    leftListTail.next = node; // Point tail node to next node
                    leftListTail = node; // reassign tail to current node
                }
            } else {
                // Insert node into end of right list
                if (rightListHead == null) {
                    rightListHead = node;
                    rightListTail = rightListHead;
                } else {
                    rightListTail.next = node;
                    rightListTail = node;
                }
            }

            node = next; // Move to next node
        }

        if (leftListHead == null) {
            return rightListHead;
        }

        /* Merge before list and after list */
        leftListTail.next = rightListHead;
        return leftListHead;
    }
}
