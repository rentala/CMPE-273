package javaCollections;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnotherCollectionsTest {

	@Test
	public void test() {
		String[] data = {"San Jose", 
				"San Jose",
				"San Jose", "San Jose", 
				"Mountain View"};
		
		JavaCollections jc = new JavaCollections(data);
		assertEquals(2, jc.getUniqueValuesCount()); 
		
	}

}
