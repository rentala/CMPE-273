package javaArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void test() {
		int[] ip = {1, -1, -2};
		SubArrays arr = new SubArrays(ip);
		assertEquals(4, arr.noOfNegativeSubArrays());
	}

}
