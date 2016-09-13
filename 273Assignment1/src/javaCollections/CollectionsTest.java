package javaCollections;

import static org.junit.Assert.*;

import org.junit.Test;

public class CollectionsTest {

	@Test
	public void test() {
		String[] data = {"San Jose", 
				"San francisco",
				"San Jose", "Santa Cruz", 
				"Mountain View"};
		
		JavaCollections jc = new JavaCollections(data);
		assertEquals(4, jc.getUniqueValuesCount()); 
		
	}

}
