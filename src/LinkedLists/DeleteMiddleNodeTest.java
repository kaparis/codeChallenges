package LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteMiddleNodeTest {

    @Test
    void testRemoveFirst() {
        util.log.consoleLog("Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        //Create linked list, one way
        ListNode nodeOne = new ListNode(1);
        ListNode nodeTwo = new ListNode(2);
        nodeOne.next = nodeTwo;
        ListNode nodeThree = new ListNode(3);
        nodeTwo.next = nodeThree;
        ListNode nodeFour = new ListNode(4);
        nodeThree.next = nodeFour;

        ListNode curNode = nodeOne;
        while (curNode != null) {
            System.out.println("Result: " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("Process **************");
        DeleteMiddleNode problem = new DeleteMiddleNode();
        boolean result = problem.routine1(nodeOne);

        curNode = nodeOne;
        while (curNode != null) {
            System.out.println("Result: " + curNode.data);
            curNode = curNode.next;
        }

        assertEquals(true, result);
        util.log.consoleLog("End ============");
    }

    @Test
    void testRemove2nd() {
        util.log.consoleLog("Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        //Create linked list, one way
        ListNode nodeOne = new ListNode(1);
        ListNode nodeTwo = new ListNode(2);
        nodeOne.next = nodeTwo;
        ListNode nodeThree = new ListNode(3);
        nodeTwo.next = nodeThree;
        ListNode nodeFour = new ListNode(4);
        nodeThree.next = nodeFour;

        ListNode curNode = nodeOne;
        while (curNode != null) {
            System.out.println("Result: " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("Process **************");
        DeleteMiddleNode problem = new DeleteMiddleNode();
        boolean result = problem.routine1(nodeTwo);

        curNode = nodeOne;
        while (curNode != null) {
            System.out.println("Result: " + curNode.data);
            curNode = curNode.next;
        }

        assertEquals(true, result);
        util.log.consoleLog("End ============");
    }

    @Test
    void testRemove3rd() {
        util.log.consoleLog("Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        //Create linked list, one way
        ListNode nodeOne = new ListNode(1);
        ListNode nodeTwo = new ListNode(2);
        nodeOne.next = nodeTwo;
        ListNode nodeThree = new ListNode(3);
        nodeTwo.next = nodeThree;
        ListNode nodeFour = new ListNode(4);
        nodeThree.next = nodeFour;

        ListNode curNode = nodeOne;
        while (curNode != null) {
            System.out.println("Result: " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("Process **************");
        DeleteMiddleNode problem = new DeleteMiddleNode();
        boolean result = problem.routine1(nodeThree);

        curNode = nodeOne;
        while (curNode != null) {
            System.out.println("Result: " + curNode.data);
            curNode = curNode.next;
        }

        assertEquals(true, result);
        util.log.consoleLog("End ============");
    }

    @Test
    void testRemoveLast() {
        util.log.consoleLog("Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        //Create linked list, one way
        ListNode nodeOne = new ListNode(1);
        ListNode nodeTwo = new ListNode(2);
        nodeOne.next = nodeTwo;
        ListNode nodeThree = new ListNode(3);
        nodeTwo.next = nodeThree;
        ListNode nodeFour = new ListNode(4);
        nodeThree.next = nodeFour;

        ListNode curNode = nodeOne;
        while (curNode != null) {
            System.out.println("Result: " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("Process **************");
        DeleteMiddleNode problem = new DeleteMiddleNode();
        boolean result = problem.routine1(nodeFour);

        curNode = nodeOne;
        while (curNode != null) {
            System.out.println("Result: " + curNode.data);
            curNode = curNode.next;
        }

        assertEquals(false, result);
        util.log.consoleLog("End ============");
    }

}