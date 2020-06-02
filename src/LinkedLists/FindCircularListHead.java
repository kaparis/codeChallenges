/*
 * Problem
 * =====================
 * Loop Detection
 *
 * Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
 *
 * DEFINITION Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node,
 * so as to make a loop in the linked list.
 *
 * Example
 * =====================
 * Input: A -> B -> C -> D -> E -> C [the same C as earlier]
 * Output: C
 *
 * Solution Steps
 * =====================
 * For Current Node
 * Check all previous nodes, is current node next one of those?
 * If true, return that node
 * If false, move to next node
 *
 * 2 pointer approach : Fast runner and slow runner
 * Faster Pointer: move in 2x
 * Slow Pointer: move in 1x
 * If colide, slow pointer moves to head, fast pointer stays
 * then Faster point and slow pointer move at 1x, return colliision node

 */

package LinkedLists;

import java.util.List;

public class FindCircularListHead {

    ListNode FindBeginning(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        // Find if the list as a meeting point. (eventually meets if circular)
        // This will be LOOP_SIZE - k steps into the linked list.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                //Collision
                break;
           }
        }

        // Error check - no meeting point, and therefore no loop
        if (fast == null || fast.next == null) {
            return null;
        }

        // Move slow to Head.
        // Keep fast at Meeting Point.
        // Each are k steps from the Loop Start.
        // If they move at the same pace, they must meet at Loop Start.
        slow = head;
        while (slow!= fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Both now point to the start of the loop.
        return fast;
    }
}
