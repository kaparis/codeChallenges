package LinkedLists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumListsTest {

    ListNode firstNumber;
    ListNode secondNumber;

    @BeforeEach
    void setUp() {
        System.out.println("\n**** Setup: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        firstNumber = new ListNode(7);

        ListNode firstNumbernodeTwo = new ListNode(1);
        firstNumber.next = firstNumbernodeTwo;

        ListNode firstNumbernodeThree = new ListNode(6);
        firstNumbernodeTwo.next = firstNumbernodeThree;

        secondNumber = new ListNode(5);

        ListNode secondNumbernodeTwo = new ListNode(9);
        secondNumber.next = secondNumbernodeTwo;

        ListNode secondNumbernodeThree = new ListNode(2);
        secondNumbernodeTwo.next = secondNumbernodeThree;


        System.out.print("1st number: " );
        ListNode curNode = firstNumber;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");
        System.out.print("2nd number: " );
        curNode = secondNumber;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");
    }

    void setUpOneNode() {
        System.out.println("\n**** Setup: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        firstNumber = new ListNode(7);
        secondNumber = new ListNode(5);

        System.out.print("1st number: " );
        ListNode curNode = firstNumber;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");
        System.out.print("2nd number: " );
        curNode = secondNumber;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");
    }

    @Test
    void routineRecursive() {
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        SumLists problem = new SumLists();
        ListNode result = problem.routineRecursive(firstNumber, secondNumber,0);

        ListNode curNode = result;

        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }

        assertEquals(false, false);
        util.log.consoleLog("\n**** End");
    }

    @Test
    void routineRecursiveOneNode() {
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        setUpOneNode();
        SumLists problem = new SumLists();
        ListNode result = problem.routineRecursive(firstNumber, secondNumber,0);

        ListNode curNode = result;

        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }

        assertEquals(false, false);
        util.log.consoleLog("\n**** End");
    }
}