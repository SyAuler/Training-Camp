package reentrantReadWriteLock;

import java.util.concurrent.atomic.AtomicInteger;

public class ReentrantReadWriteLock {

	public static void main(String[] args) {
		
		
		AtomicInteger i = new AtomicInteger(0);
		AtomicInteger j = new AtomicInteger(0);
		AtomicInteger k = new AtomicInteger(0); 
		ThreadSafeArrayListWrapper<String> list = new ThreadSafeArrayListWrapper<String>();
		
		Thread t1 = new Thread(new MyWorkerThread(i, list));
		Thread t2 = new Thread(new MyWorkerThread(i, list));
		Thread t3 = new Thread(new MyReadThread(j, list));
		Thread t4 = new Thread(new MyReadThread(j, list));
		Thread t5 = new Thread(new MyRemoveThread(k, list));
		Thread t6 = new Thread(new MyRemoveThread(k, list));
		long t0 = System.nanoTime();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		try {
			t1.join();
			t3.join();
			t5.join();
			t2.join();
			t4.join();
			t6.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Time: %d nanoseconds\n", System.nanoTime()-t0);
	}
}
