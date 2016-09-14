package javaQueue;

import java.util.LinkedList;
import java.util.Queue;
/*
 * At a Pastry shop, chef makes donuts of different sizes and price.
 * We sell donuts based on the price of a queue of prices given by the chef.
 * Implement a program that lets customers check price and buy donuts
 */
public class javaQueue {

	private Queue<Integer> queue;
	public javaQueue() {
		queue = new LinkedList<>();
		
	}
	public int getDonut()
	{
		return queue.remove();
	}
	public void addDonut(int price){
		queue.add(price);
	}
	public int checkPrice()
	{
		return queue.peek();
	}

}
