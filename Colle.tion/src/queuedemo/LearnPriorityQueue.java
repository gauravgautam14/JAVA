package queuedemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
public static void main(String[] args) {
	Queue<Integer>pq=new PriorityQueue<>();
	pq.offer(20);
	pq.add(30);
	pq.offer(5);
	pq.offer(25);
	System.out.println(pq);
	pq.poll();
	System.out.println(pq);
	System.out.println(pq.peek());
}
}
