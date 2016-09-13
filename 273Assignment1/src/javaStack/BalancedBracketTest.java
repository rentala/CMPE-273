package javaStack;
import static org.junit.Assert.*;

import org.junit.Test;

public class BalancedBracketTest {

	@Test
	public void test() {
		javaStacks brackets = new javaStacks("{int a = 1;}{{}}");
		assertTrue(brackets.isBalancedBrackets());
	}

}
