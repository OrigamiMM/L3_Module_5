package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {
	Stack<Character> bracket;

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{{{{{{{{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		bracket = new Stack<Character>();
		System.out.println("the method is being called");
		for (int i = 0; i < b.length(); i++) {
			System.out.println(b.charAt(i));
			if (b.charAt(i) == '}') {
				if (bracket.isEmpty()) {
					return false;
				} else {
					bracket.pop();
				}
			} else {
				bracket.push(b.charAt(i));
			}

		}
		if (bracket.isEmpty()) {
			System.out.println("");
			return true;
		} else {
			return false;
		}
	}

}