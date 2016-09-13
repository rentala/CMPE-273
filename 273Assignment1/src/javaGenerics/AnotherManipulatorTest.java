package javaGenerics;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnotherManipulatorTest {

	@Test
	public void test() {
		String[] data = {"Hey", "there", "welcome"};
		Manipulator<String> compt = new Manipulator<String>(data);
		String[] result = {"welcome", "there", "Hey"};
		String[] actual = compt.getReverse();
		assertEquals(result, actual);
	}

}
