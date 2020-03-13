package reentrantReadWriteLock;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRemoveThread implements Runnable{
	
	private AtomicInteger i = null;
	ThreadSafeArrayListWrapper<String> list;
	
	public MyRemoveThread(AtomicInteger i, ThreadSafeArrayListWrapper<String> list) {
		this.i = i;
		this.list = list;
	}
	
	@Override
	public void run() {
		while(i.get() < 600) {
			Util.workHardFor(20);
			if(list.size() == 0) {
				Util.waitFor(10);
			} 
			else {
				Util.workHardFor(20);
				int pos =i.getAndIncrement() % list.size();
				list.remove(pos);
			} 
		}
		System.out.printf("thread Remove finished: %s\n", Thread.currentThread().getName());
	}
	
}
