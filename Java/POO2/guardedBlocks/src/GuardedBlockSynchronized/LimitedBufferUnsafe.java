package GuardedBlockSynchronized;

import java.lang.reflect.Array;

class LimitedBufferUnsafe<T extends Object> {
	T buff[];
	volatile int posInsert = 0;
	volatile int posRemove = 0;
	volatile int count = 0;

	public LimitedBufferUnsafe(Class<T[]> clazz, int size) {
		buff = clazz.cast(Array.newInstance(clazz.getComponentType(), size));
	}

	public void put(T obj) {
		if (isFull()) {
			throw new RuntimeException("Buffer Overflow");
		}
		buff[posInsert] = obj;
		posInsert = ++posInsert % buff.length;
		++count;
	}

	public T get() {
		if (this.count == 0) {
			return null;
		}
		T obj = (T) buff[posRemove];
		posRemove = ++posRemove % buff.length;
		--count;

		return obj;
	}

	public boolean isFull() {
		return count == buff.length;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public int getCount() {
		return this.count;
	}
}
