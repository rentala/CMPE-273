package javaGenerics;

import static org.junit.Assert.*;

import org.junit.Test;
import javaInterface.*;
public class ManipulatorTest {

	@Test
	public void test() {
		Integer[] data = {3, 4,5,567, 234, 32423};
		Manipulator<Integer> compt = new Manipulator<Integer>(data);
		Integer[] result = {32423, 234, 567, 5, 4, 3};
		Integer[] actual = compt.getReverse();
		assertEquals(result, actual);
	}
	
}
