package LinkedLists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsPalindromeTest {

    ListNode goodPalidrome;
    ListNode goodPalidromeOneNode = new ListNode(1);
    ListNode badPalidrome;
    ListNode goodPalidromeOddNumber;
    
    @BeforeEach
    void setUp() {
        System.out.println("\n**** Setup: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        goodPalidrome = new ListNode(1);

        ListNode node2 = new ListNode(2);
        goodPalidrome.next = node2;

        ListNode node3 = new ListNode(1);
        node2.next = node3;

        badPalidrome = new ListNode(1);

        ListNode node2_1 = new ListNode(2);
        badPalidrome.next = node2_1;

        ListNode node2_2 = new ListNode(3);
        node2_1.next = node2_2;

        goodPalidromeOddNumber = new ListNode(3);
        goodPalidromeOddNumber.next = new ListNode(1);
        goodPalidromeOddNumber.next.next = new ListNode( 3);

        System.out.print("1st List: " );
        ListNode curNode = goodPalidrome;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");
        System.out.print("2nd List: " );
        curNode = badPalidrome;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");

        System.out.print("Odd List: " );
        curNode = goodPalidromeOddNumber;
        while ( curNode != null) {
            System.out.print(": " + curNode.data);
            curNode = curNode.next;
        }
        System.out.println("");
    }

    @Test
    void IsPalindrome() {
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        IsPalindrome problem = new IsPalindrome();
        Boolean result = problem.routineIsPalindrome(goodPalidrome);

        assertEquals(true, result);
        util.log.consoleLog("\n**** End");
    }

    @Test
    void NotPalindrome() {
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        IsPalindrome problem = new IsPalindrome();
        Boolean result = problem.routineIsPalindrome(badPalidrome);

        assertEquals(false, result);
        util.log.consoleLog("\n**** End");
    }

    @Test
    void OneNodeTest() {
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        IsPalindrome problem = new IsPalindrome();
        Boolean result = problem.routineIsPalindrome(goodPalidromeOneNode);

        assertEquals(true, result);
        util.log.consoleLog("\n**** End");
    }

    @Test
    void OddNumNodeTest() {
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        IsPalindrome problem = new IsPalindrome();
        Boolean result = problem.routineIsPalindrome(goodPalidromeOddNumber);

        assertEquals(true, result);
        util.log.consoleLog("\n**** End");
    }
}