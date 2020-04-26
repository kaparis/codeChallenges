package arraysAndStrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringRotationTest {

	@Test
	void goodRotation() {
		String s1= "waterbottle";
		String s2 = "erbottlewat";

		StringRotation problem = new StringRotation();
		boolean result = problem.routine1(s1,s2);
		
		util.log.consoleLog("===TEST===");
		util.log.consoleLog("Result: " + result);
		
		
		assertEquals(true, result);

	}
	
	@Test
	void badRotation() {
		String s1= "waterbottle";
		String s2 = "erbottlewatt";

		StringRotation problem = new StringRotation();
		boolean result = problem.routine1(s1,s2);
		
		util.log.consoleLog("===TEST===");
		util.log.consoleLog("Result: " + result);
		
		
		assertEquals(false, result);

	}

}
