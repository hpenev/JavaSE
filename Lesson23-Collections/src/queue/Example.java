package queue;

import java.util.PriorityQueue;

public class Example {
    public static void main(String[] args) {
	PriorityQueue<String> pQueue = new PriorityQueue<>();
	pQueue.offer("first");
	pQueue.offer("SECOND");
	pQueue.offer("!asd");
	System.out.println(pQueue);

    }
}
