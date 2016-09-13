package javaQueue;

import java.util.LinkedList;
import java.util.Queue;

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
