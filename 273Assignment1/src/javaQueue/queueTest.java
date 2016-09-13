package javaQueue;

import static org.junit.Assert.*;

import org.junit.Test;

public class queueTest {

	@Test
	public void test() {
		javaQueue q = new javaQueue();
		q.addDonut(10);
		q.addDonut(20);
		assertEquals(10, q.checkPrice());
		q.getDonut();
		assertEquals(20, q.checkPrice());
		q.addDonut(45);
		q.addDonut(25);
		assertEquals(20, q.getDonut());
		assertEquals(45, q.checkPrice());
		
		
	}

}
