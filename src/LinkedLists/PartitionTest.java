package LinkedLists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionTest {


    // Create linked list, one way
    ListNode headNode = new ListNode(1);

    @BeforeEach
    void setUp() {
        ListNode nodeTwo = new ListNode(4);
        headNode.next = nodeTwo;
        ListNode nodeThree = new ListNode(3);
        nodeTwo.next = nodeThree;
        ListNode nodeFour = new ListNode(2);
        nodeThree.next = nodeFour;
        ListNode nodeFive = new ListNode(5);
        nodeFour.next = nodeFive;
    }
    void testSeperation(int x) {
        util.log.consoleLog("Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        ListNode curNode = headNode;
        while (curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }

        System.out.println("\nProcess **************");
        Partition problem = new Partition();
        ListNode resultNodeList = problem.routine1(headNode,x);

        curNode = resultNodeList;
        while (curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }

        //assertEquals(true, true);
        util.log.consoleLog("\nEnd ============");


    }

    @Test
    void testSeperationSmallest()
    {
        testSeperation(1);
    }

    @Test
    void testSeperationMiddle()
    {
        testSeperation(3);
    }

    @Test
    void testSeperationLargest()
    {
        testSeperation(5);
    }




}