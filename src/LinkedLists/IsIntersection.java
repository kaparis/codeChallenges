/*
 * Problem
 * =====================
 * Intersection
 *
 * Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node.
 * Note that the intersection is defined based on reference, not value.
 *
 * That is, if the kth node of the first linked list is the exact same node (by reference) as the jth node of
 * the second linked list, then they are intersecting.
 *
 * Example
 * =====================
 * List A: 1 2 3 2 1
 * Intersected       1 2 3
 * List B:       4 6
 *
 * Solution Notes
 * =====================
 * Option 1: loop through first list and compare each node.next to second list
 * Option 2: Knowing the length, chop off head
 *
 */

package LinkedLists;

public class IsIntersection {


    // BIG O( A + B)
    ListNode IsIntersecting(ListNode one, ListNode two) {
       ListNode intersectedNode = null;

       ListNode currNodeOne = one;
       ListNode currNodeTwo = two;

       while (currNodeOne.next != null)
       {
           while (currNodeTwo.next != null)
           {
               if (currNodeOne.next == currNodeTwo.next)
               {
                   return currNodeOne.next;
               }

               currNodeTwo = currNodeTwo.next;
           }

           currNodeOne = currNodeOne.next;
           currNodeTwo = two; // reset to begining
       }

       return intersectedNode;
    }
}
