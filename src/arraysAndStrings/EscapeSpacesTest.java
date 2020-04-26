package arraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class EscapeSpacesTest {

	char[] urlCheck(String strUrl) {
		
		EscapeSpaces routine = new EscapeSpaces();
		
		int strUrlTrueLength = strUrl.length();
		char[] url = new char[100];
		
		for (int i = 0 ; i < strUrl.length() ; i++)
			url[i] = strUrl.charAt(i);
		
		routine.escapeSpaces(url, strUrlTrueLength);
		
		util.log.consoleLog("         URL: " + strUrl.toString());
		util.log.consoleLog(" URL Escaped: " + Arrays.toString(url));
		
		return url;
	}
	
	
	@Test
	void trailingSpace() {
		String strUrl = "google   ";
		int spaceCount = 0;
		int escapeCount = 0;
		
		util.log.consoleLog("======: " + Thread.currentThread().getStackTrace()[1].getMethodName());
		
		char[] url = urlCheck(strUrl);
		
		for (int i = 0 ; i < strUrl.length(); i++)
			if (strUrl.charAt(i) == ' ') spaceCount++;
		
		for (int i = 0 ; i < url.length-1; i++)
			if (url[i] == '%') escapeCount++;
		
		util.log.consoleLog("Space Count: " + spaceCount + " Escape Count: " + escapeCount);
		
		assertTrue(escapeCount == spaceCount);
	}

	@Test
	void precedingSpace() {
		String strUrl = "   google";
		int spaceCount = 0;
		int escapeCount = 0;
		
		util.log.consoleLog("======: " + Thread.currentThread().getStackTrace()[1].getMethodName());
		
		char[] url = urlCheck(strUrl);
		
		for (int i = 0 ; i < strUrl.length(); i++)
			if (strUrl.charAt(i) == ' ') spaceCount++;
		
		for (int i = 0 ; i < url.length-1; i++)
			if (url[i] == '%') escapeCount++;
		
		util.log.consoleLog("Space Count: " + spaceCount + " Escape Count: " + escapeCount);
		
		assertTrue(escapeCount == spaceCount);
	}

	@Test
	void middleSpace() {
		String strUrl = "goog   le";
		int spaceCount = 0;
		int escapeCount = 0;
		
		util.log.consoleLog("======: " + Thread.currentThread().getStackTrace()[1].getMethodName());
		
		char[] url = urlCheck(strUrl);
		
		for (int i = 0 ; i < strUrl.length(); i++)
			if (strUrl.charAt(i) == ' ') spaceCount++;
		
		for (int i = 0 ; i < url.length-1; i++)
			if (url[i] == '%') escapeCount++;
		
		util.log.consoleLog("Space Count: " + spaceCount + " Escape Count: " + escapeCount);
		
		assertTrue(escapeCount == spaceCount);
	}
	
	@Test
	void allSpaces() {
		String strUrl = "     ";
		int spaceCount = 0;
		int escapeCount = 0;
		
		util.log.consoleLog("======: " + Thread.currentThread().getStackTrace()[1].getMethodName());
		
		char[] url = urlCheck(strUrl);
		
		for (int i = 0 ; i < strUrl.length(); i++)
			if (strUrl.charAt(i) == ' ') spaceCount++;
		
		for (int i = 0 ; i < url.length-1; i++)
			if (url[i] == '%') escapeCount++;
		
		util.log.consoleLog("Space Count: " + spaceCount + " Escape Count: " + escapeCount);
		
		assertTrue(escapeCount == spaceCount);
	}
	
}
