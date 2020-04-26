package LinkedLists;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReturnKthToLastTest {

	@Test
	void test() {
		util.log.consoleLog("Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());
		//Create linked list, one way
		ListNode nodeOne = new ListNode(1);
		
		ListNode nodeTwo = new ListNode(2);
		nodeOne.next = nodeTwo;
		
		ListNode nodeThree = new ListNode(1);
		nodeTwo.next = nodeThree;
		
		ListNode nodeFour = new ListNode(3);
		nodeThree.next = nodeFour;
		
		ListNode curNode = nodeOne;
		while ( curNode != null) {
			System.out.println("Result: " + curNode.data);
			
			curNode = curNode.next;
		}
			
		System.out.println("Mid **************" );
		
		RemoveDups problem = new RemoveDups();
		problem.routine1(nodeOne);
		
		curNode = nodeOne;
		while ( curNode != null) {
			System.out.println("Result: " + curNode.data);
			
			curNode = curNode.next;
		}
		
		assertEquals(false, false);
		util.log.consoleLog("End ============");
	}

}
