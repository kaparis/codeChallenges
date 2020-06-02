package LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindCircularListHeadTest {

    @Test
    void IsCircularYes() {

        ListNode head1 = new ListNode(1);

        ListNode nodeA = new ListNode(2);
        head1.next = nodeA;

        ListNode nodeB = new ListNode(3);
        nodeA.next = nodeB;

        ListNode nodeC = new ListNode(4);
        nodeB.next = nodeC;

        ListNode nodeD = new ListNode(5);
        nodeC.next = nodeD;

        ListNode nodeE = new ListNode(6);
        nodeD.next = nodeC;

        ListNode curNode = head1;

        System.out.println("");
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        FindCircularListHead problem = new FindCircularListHead();
        ListNode node = problem.FindBeginning(head1);

        if (node != null)
            System.out.println("Circule Node:" + node.data);
        else
            System.out.println("Circule Node:" + "Not found");

        assertEquals(true, node != null);

        util.log.consoleLog("\n**** End");
    }

    @Test
    void IsCircularNo() {

        ListNode head1 = new ListNode(1);

        ListNode nodeA = new ListNode(2);
        head1.next = nodeA;

        ListNode nodeB = new ListNode(3);
        nodeA.next = nodeB;

        ListNode nodeC = new ListNode(4);
        nodeB.next = nodeC;

        ListNode nodeD = new ListNode(5);
        nodeC.next = nodeD;

        ListNode nodeE = new ListNode(6);
        nodeD.next = null;

        ListNode curNode = head1;

        System.out.println("");
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        FindCircularListHead problem = new FindCircularListHead();
        ListNode node = problem.FindBeginning(head1);

        if (node != null)
            System.out.println("Circule Node:" + node.data);
        else
            System.out.println("Circule Node:" + "Not found");

        assertEquals(false, node != null);

        util.log.consoleLog("\n**** End");
    }

}