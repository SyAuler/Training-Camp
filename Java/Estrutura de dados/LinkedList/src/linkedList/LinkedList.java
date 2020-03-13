package linkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList <T> implements List<T> {

	private Node<T> first = null;
	private Node<T> last = null;
	private int size = 0;

	public LinkedList() { // com ou sem construtor, não faz diferença (padrão)
		super();
	}

	@Override
	public boolean add(T content) { // critério de fila (FIFO)

		Node<T> node = new Node<>(content, null);

		if (size == 0) {
			this.first = node;
			this.last = node;
			this.size = 1;

			return true;
		}
		this.last.next = node;
		this.last = node;
		size++;

		return true;
	}

	@Override
	public T remove(int index) {

		if (size == 0) { //lista vazia
			return null;
		}

		if (index == 0) { //first element
			T content = this.first.content;
			this.first = this.first.next;
			size--;

			return content;
		}

		Node<T> aux = this.first;

		for (int i = 1; i < index; i++) {
			aux = aux.next;
		}
		
		T content = aux.next.content;
		aux.next = aux.next.next;
		size--;
		
		if (index == size) { //last element
			this.last = aux;
		}
		return content;

	}

	@Override
	public void add(int arg0, T arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends T> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T set(int arg0, T arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<T> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}



}
