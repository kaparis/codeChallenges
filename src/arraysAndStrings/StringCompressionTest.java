package arraysAndStrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCompressionTest {

	@Test
	void testCompress() {
		String encode = "aabcccccaaa";
		String encoded = "a2b1c5a3";
		String result = "";
	
		StringCompression problem = new StringCompression();
		result = problem.routine(encode);
		
		util.log.consoleLog("===TEST 1===");
		util.log.consoleLog("Original: " + encode);
		util.log.consoleLog("Expected: " + encoded);
		util.log.consoleLog(" Encoded: " + result);
		
		assertEquals(encoded, result);
	}
	
	@Test
	void testCompressRoutine2() {
		String encode = "aabcccccaaa";
		String encoded = "a2b1c5a3";
		String result = "";
	
		StringCompression problem = new StringCompression();
		result = problem.routine2(encode);
		
		util.log.consoleLog("===TEST 2===");
		util.log.consoleLog("Original: " + encode);
		util.log.consoleLog("Expected: " + encoded);
		util.log.consoleLog(" Encoded: " + result);
		
		assertEquals(encoded, result);
	}


}
