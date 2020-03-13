package reentrantReadWriteLock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSafeArrayListWrapper<E> {
	private final ReadWriteLock lock = new ReentrantReadWriteLock(true); 
	private final List<E> list = new ArrayList<E>();
	
	public void add(E e) {
		try { 
			lock.writeLock().lock();
			list.add(e);
			System.out.printf("Adding element %s by thread %s\n", e, Thread.currentThread().getName()); 
		} finally {
			lock.writeLock().unlock();
		}
	}
	
	public void get(int i) {
		try {
			lock.readLock().lock();
			System.out.printf("Read element %s by thread %s\n", list.get(i), Thread.currentThread().getName());
		} finally {
			lock.readLock().unlock();
		}
	}
	
	public void remove(int i) {
		try {
			lock.writeLock().lock();
			list.remove(i);
			System.out.printf("Removed element by thread %s\n", Thread.currentThread().getName());
		} finally {
			lock.writeLock().unlock();
		}
	}
	
	
	public int size() {
		try{
			lock.readLock().lock();
			return list.size();
		} finally{
			lock.readLock().unlock();
		}
		
	}
	
}
