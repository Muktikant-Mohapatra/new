package linkedList;

public class LinkedList {
	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	private Node first;
	private Node last;

	public void add(int value) {
		Node node = new Node(value);
		if (first == null) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	public void addFirst(int value) {
		Node node = new Node(value);
		if (first == null) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}
	}

	public void addLast(int value) {
		Node node = new Node(value);
		if (first == null) {
			first = last = node;

		} else {
			last.next = node;
			last = node;
		}
	}

	public int indexOf(int value) {
		int index = 0;
		Node current = first;
		while (current != null) {
			if (current.value == value) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}

	public void remove(int value) {
		Node current = first;
		Node previous=null;
		Node next=null;
		while (current != null) {
			if (current.value == value) {
				first = current.next;
			}
			previous=current;
			current = current.next;
			next=current.next;
			if (current.value == value) {
              previous.next=next;
			}
		}

	}

}
