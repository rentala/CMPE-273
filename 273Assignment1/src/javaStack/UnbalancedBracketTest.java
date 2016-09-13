package javaStack;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnbalancedBracketTest {

	@Test
	public void test() {
		javaStacks brackets = new javaStacks("{{{}}");
		assertFalse(brackets.isBalancedBrackets());
	}

}
