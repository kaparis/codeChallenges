/*
 * Problem
 * =====================
 * Palindrome
 *
 * Implement a function to check if a linked list is a palindrome (reads the same backward as forward).
 *
 * Example
 * =====================
 *
 *
 * Solution Notes
 * =====================
 *
 *

 */

package LinkedLists;

public class IsPalindrome {

    boolean routineIsPalindrome(ListNode nodeHead)
    {
        // Reverse
        ListNode reversedHead = reverseListNode (nodeHead);
        // compare
        boolean isPalindrome = isEqual(nodeHead, reversedHead);

        return isPalindrome;
    }

    boolean recuriveIsPalindrome(ListNode nodeHead, int length) throws Exception {

        // we need the length. Eithier find it or be given the value.
        // recurse until at middle node; when length/2=0
        // Condition: compare head node to tail node
        // Compare its head node to tail node returned
        // return value can be the node or a boolean for result. to do this, will create a class to hold both and return
        return true;
    }

    ListNode reverseListNode (ListNode node) {
        ListNode head = null; // must be null to indicate end of list.

        while (node != null) {
            // Clone Node
            ListNode n = new ListNode(node.data);
            // Points copied node.next to previous head node)
            n.next = head;
            // Point Head node points to current cloned node.
            head = n;
            // Go to next node
            node = node.next;
        }

        return head;
    }

    boolean isEqual(ListNode one, ListNode two)
    {
        while (one != null && two != null)
        {
            if (one.data != two.data)
                return false;
            one = one.next;
            two = two.next;
        }
        return one== null && two== null;
    }
}
