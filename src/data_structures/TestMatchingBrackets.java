package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {
	Stack<String> bracket;

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		bracket = new Stack<String>();
		String bHold;
		System.out.println("This method is being called");
		for (int i = b.length() - 1; i > -1; i--) {
			String brac = (String.valueOf(b.charAt(i)));
			System.out.println(brac);
			bracket.push(brac);
		}

		for (int i = 0; i < bracket.size(); i++) {
			if (bracket.pop().equals("{")) {
				for (int j = 0; j < bracket.size(); j++) {
					bHold = bracket.pop();
					if (bHold.equals("{")) {
						bracket.push(bHold);
					}
				}
			} else {
				return false;
			}
		}
		if (bracket.size() == 0) {
			System.out.println("It matches");
			System.out.println("");
			return true;
		}
		System.out.println("something is wrong");
		return false;

	}

}