package reentrantReadWriteLock;

import java.util.concurrent.atomic.AtomicInteger;

public class MyWorkerThread implements Runnable{
	
	private AtomicInteger i = null;
	ThreadSafeArrayListWrapper<String> list;
	
	public MyWorkerThread(AtomicInteger i, ThreadSafeArrayListWrapper<String> list) {
		this.i = i;
		this.list = list;
	}
	
	@Override
	public void run() {
		while(i.get() < 600) {
			Util.workHardFor(20);
			list.add(String.valueOf(i.getAndIncrement()));
		}
		System.out.printf("thread finished: %s\n", Thread.currentThread().getName());
	}
	
}
