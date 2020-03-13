package linkedList;

public class Node <T> {

	Node<T> next = null;
	T content = null;
	
	public Node(T content, Node<T> next) {
		this.content = content;
		this.next = next;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
}
