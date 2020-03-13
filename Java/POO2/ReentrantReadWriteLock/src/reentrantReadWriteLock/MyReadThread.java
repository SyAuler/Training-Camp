package reentrantReadWriteLock;

import java.util.concurrent.atomic.AtomicInteger;

public class MyReadThread implements Runnable{
	
	private AtomicInteger i = null;
	ThreadSafeArrayListWrapper<String> list;
	
	public MyReadThread(AtomicInteger i, ThreadSafeArrayListWrapper<String> list) {
		this.i = i;
		this.list = list;
	}
	
	@Override
	public void run() {
		while(i.get() < 600) {
			Util.workHardFor(20);
			if(list.size() == 0) {
				Util.waitFor(20);
			} 
			else {
				int pos = i.getAndIncrement() % list.size();
				list.get(pos);
			} 
				
		}
		System.out.printf("thread Read finished: %s\n", Thread.currentThread().getName());
	}
	
}
