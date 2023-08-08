package javapracticeproblems;
import java.util.*;
public class Main25 {
//Consider the following reference string: 10, 20, 30, 40, 40, 50
//Find the number of page faults using the least recently used (LRU) page replacement
//algorithm with 4-page frames.
//Explanation
//Let's use the Least Recently Used (LRU) page replacement algorithm to calculate the
//number of page faults for the given reference string: 10, 20, 30, 40, 40, 50
//with a 4-page frame.
//The LRU algorithm works by replacing the least recently used page in memory when a
//page fault occurs. Here's the step-by-step breakdown of the page replacements:
//Remember the page frame size is 4
//Input : 10
//10
//Input : 20 (Still page frame is available it is added in the front)
//20 10
//Input : 30 (Still page frame is available it is added in the front)
//30 20 10
//Input : 40 (Still page frame is available it is added in the front)
//40 30 20 10
//Input : 40 (Since 40 is already present in page frame it is not taken)
//40 30 20 10
//Input : 50 (Since page frame is full now the rear element is removed and input is added
//in the front)
//50 40 30 20
			Deque<Integer> doublyQueue;
			final int CACHE_SIZE;
			Main25(int capacity)
			{
			doublyQueue = new LinkedList<>();
			CACHE_SIZE = capacity;
			}
			public void refer(int page)
			{
			if (!doublyQueue.contains(page)) {
			if (doublyQueue.size() == CACHE_SIZE) {
			int last = doublyQueue.removeLast();
			}
			}
			else {
			doublyQueue.remove(page);
			}
			doublyQueue.push(page);
			}
			public void display()
			{
			Iterator<Integer> itr = doublyQueue.iterator();
			while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
			}
			}
			public static void main(String[] args)
			{
			Main25 cache = new Main25(4);
			cache.refer(10);
			cache.refer(20);
			cache.refer(30);
			cache.refer(40);
			
			cache.refer(40);
			cache.refer(50);
			cache.display();
			}
}
