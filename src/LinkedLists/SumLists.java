/*
 * Problem
 * =====================
 * Sum Lists
 *
 * You have two numbers represented by a linked list, where each node contains a single digit.
 * The digits are stored in reverse order, such that the 1 's digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 *
 * FOLLOW UP Suppose the digits are stored in forward order.
 * Repeat the above problem.
 *
 * Example
 * =====================
 * Reverse Order
 * Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
 * Output: 2 -> 1 -> 9. That is, 912.
 *
 * Forward Order
 * Input:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
 * Output: 9 -> 1 -> 2. That is, 912.
 *
 * Solution Notes
 * =====================
 *
 *

 */

package LinkedLists;

public class SumLists {

    public ListNode routineRecursive(ListNode firstNumberList, ListNode secondNumberList, int carryOver) {
        // recursive implementation
        // stack: add first two numbers, get carryover number
        // stack: call self, and provide carry
        // stack: repeat
        // exit condition : no next node
        // unstack: final node : return node result
        // unstack: link return node to current node

        if (firstNumberList == null | secondNumberList == null)
            return null;

        int sum = (carryOver + firstNumberList.data + secondNumberList.data) % 10;
        int sumCarryOver = (firstNumberList.data + secondNumberList.data) / 10;

        ListNode sumNodeList = new ListNode(sum);

        if (firstNumberList.next != null) {
            sumNodeList.next = routineRecursive(firstNumberList.next, secondNumberList.next, sumCarryOver);
        } else if (sumCarryOver != 0) {
            sumNodeList.next = new ListNode(sumCarryOver);
        }
        return sumNodeList;
    }
}
