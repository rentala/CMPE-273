package javaInterface;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void test() {
		CellPhone MotoG = new CellPhone();
		MotoG.setPrice(200);
		assertEquals(200, MotoG.getPrice());
		assertEquals(ProductType.Electronic, MotoG.getProductType());
	}

}
