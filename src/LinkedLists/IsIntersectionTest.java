package LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsIntersectionTest {



    @Test
    void isIntersectingYes() {
        ListNode head1 = new ListNode(1);
        ListNode nodeA = new ListNode(2);
        ListNode nodeB = new ListNode(3);
        ListNode nodeC = new ListNode(4);

        ListNode nodeD = new ListNode(5);
        ListNode nodeE = new ListNode(6);

        ListNode head2 = new ListNode(33);
        ListNode nodeF = new ListNode(44);

        head1.next = nodeA;
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        head2.next = nodeF;
        nodeF.next = nodeD;


        ListNode curNode = head1;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");
        curNode = head2;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");

        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        IsIntersection problem = new IsIntersection();
        ListNode node = problem.IsIntersecting(head1, head2);

        if (node != null)
            System.out.println("Intersect Node:" + node.data);
        else
            System.out.println("Intersect Node:" + "Not found");

        assertEquals(true, node != null);

        util.log.consoleLog("\n**** End");
    }

    @Test
    void isIntersectingNo() {
        ListNode head1 = new ListNode(1);
        ListNode nodeA = new ListNode(2);
        ListNode nodeB = new ListNode(3);
        ListNode nodeC = new ListNode(4);

        ListNode nodeD = new ListNode(5);
        ListNode nodeE = new ListNode(6);

        ListNode head2 = new ListNode(33);
        ListNode nodeF = new ListNode(44);

        head1.next = nodeA;
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;



        ListNode curNode = head1;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");
        curNode = head2;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");

        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        IsIntersection problem = new IsIntersection();
        ListNode node = problem.IsIntersecting(head1, head2);

        if (node != null)
            System.out.println("Intersect Node:" + node.data);
        else
            System.out.println("Intersect Node:" + "Not found");

        assertEquals(false, node != null);

        util.log.consoleLog("\n**** End");
    }


    @Test
    void isIntersectingSizeOneNo() {
        ListNode head1 = new ListNode(1);
//        ListNode nodeA = new ListNode(2);
//        ListNode nodeB = new ListNode(3);
//        ListNode nodeC = new ListNode(4);

//        ListNode nodeD = new ListNode(5);
//        ListNode nodeE = new ListNode(6);

        ListNode head2 = new ListNode(33);
//        ListNode nodeF = new ListNode(44);

//        head1.next = nodeA;
//        nodeA.next = nodeB;
//        nodeB.next = nodeC;
//        nodeC.next = nodeD;
//        nodeD.next = nodeE;

//        head2.next = nodeF;
//        nodeF.next = nodeD;


        ListNode curNode = head1;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");
        curNode = head2;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");

        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        IsIntersection problem = new IsIntersection();
        ListNode node = problem.IsIntersecting(head1, head2);

        if (node != null)
            System.out.println("Intersect Node:" + node.data);
        else
            System.out.println("Intersect Node:" + "Not found");

        assertEquals(false, node != null);

        util.log.consoleLog("\n**** End");
    }

    @Test
    void isIntersectingSizeTwoNo() {
        ListNode head1 = new ListNode(1);
        ListNode nodeA = new ListNode(2);
//        ListNode nodeB = new ListNode(3);
//        ListNode nodeC = new ListNode(4);

//        ListNode nodeD = new ListNode(5);
//        ListNode nodeE = new ListNode(6);

        ListNode head2 = new ListNode(33);
        ListNode nodeF = new ListNode(44);

        head1.next = nodeA;
//        nodeA.next = nodeB;
//        nodeB.next = nodeC;
//        nodeC.next = nodeD;
//        nodeD.next = nodeE;

        head2.next = nodeF;
//        nodeF.next = nodeD;


        ListNode curNode = head1;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");
        curNode = head2;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");

        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        IsIntersection problem = new IsIntersection();
        ListNode node = problem.IsIntersecting(head1, head2);

        if (node != null)
            System.out.println("Intersect Node:" + node.data);
        else
            System.out.println("Intersect Node:" + "Not found");

        assertEquals(false, node != null);

        util.log.consoleLog("\n**** End");
    }

    @Test
    void isIntersectingSizeTwoYes() {
        ListNode head1 = new ListNode(1);
        ListNode nodeA = new ListNode(2);
//        ListNode nodeB = new ListNode(3);
//        ListNode nodeC = new ListNode(4);

//        ListNode nodeD = new ListNode(5);
//        ListNode nodeE = new ListNode(6);

        ListNode head2 = new ListNode(33);
//        ListNode nodeF = new ListNode(44);

        head1.next = nodeA;
//        nodeA.next = nodeB;
//        nodeB.next = nodeC;
//        nodeC.next = nodeD;
//        nodeD.next = nodeE;

        head2.next = nodeA;
//        nodeF.next = nodeD;


        ListNode curNode = head1;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");
        curNode = head2;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");

        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        IsIntersection problem = new IsIntersection();
        ListNode node = problem.IsIntersecting(head1, head2);

        if (node != null)
            System.out.println("Intersect Node:" + node.data);
        else
            System.out.println("Intersect Node:" + "Not found");

        assertEquals(true, node != null);

        util.log.consoleLog("\n**** End");
    }
}