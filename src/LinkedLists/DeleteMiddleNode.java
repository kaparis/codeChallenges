/*
 * Problem
 * =====================
 * Delete Middle Node
 *
 * Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, not necessarily the exact middle)
 * of a singly linked list, given only access to that node.
 *
 * EXAMPLE
 * =====================
 * The node c from the linked lista->b->c->d->e->f
 * Result: nothing is returned, but the new linked list looks like a->b->d->e->f
 *
 * Solution Notes
 * =====================
 *
 */

package LinkedLists;

public class DeleteMiddleNode {

    // Note, won't know if its the first node
    // Note, if last node, can't be solved
    public boolean routine1(ListNode node)
    {
        // make sure null wasn't passed and isn't last node
        if (node == null | node.next == null)
            return false;

        node.data = node.next.data;
        node.next = node.next.next;

        return true;
    }
}