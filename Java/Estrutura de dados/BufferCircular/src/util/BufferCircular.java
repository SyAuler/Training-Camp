package util;

public class BufferCircular <T>{

	private int size = 0;
	private int posInsert = 0;
	private int posRemove = 0;
	private Object[] elementData = null;
	
	public BufferCircular(int capacity) {
		elementData = new Object[capacity];
	}
	
	public void push(T obj) {
		if (isFull()) {
			throw new BufferOverflowException(Buffer is full);
		}
		elementData[posInsert++] = obj;
		size++;
		if (posInsert == elementData.length) {
			posInsert = 0;
		}
	}
	
	public T pop() {
		if (isEmpty()) {
			throw new BufferOverflowException("Buffer is empty");
			
			@SuppressWarnings("unchecked")
			T aux = (T) elementData[posRemove++];
			size --;
			if (posRemove == elementData.length) {
				posRemove = 0;
			}
			return aux;
		}
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public boolean isFull() {
		return size == elementData.length;
	}
}
