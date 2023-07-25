package simpleLinkedList;

import java.util.Stack;

public class LinkedList {
	private Node head;

	public LinkedList() {
		head = null;
	}

	// insertion of the data

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		// insert at begin
		if (head == null) {
			head = newNode;
			return true;
		}
		// insert at last
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		return true;
	}

	// display the data from start to end
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	// displaying in the reverse manner
	// we will be using the stack for this
	public void dispRev() {
		Node temp = head;
		Stack<Node> s = new Stack<Node>();
		while (temp != null) {
			s.push(temp);
			temp = temp.getNext();
		}
		while (!s.isEmpty()) {
			System.out.println(s.pop().getData());
		}
	}

	// inserting the element at a given position
	public boolean insertAtPos(int data, int pos) {
		if (pos < 0 || head == null) {
			return false;
		}
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (pos == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		Node prev = head;
		for (int i = 1; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}

	// deletion by value
	public boolean deleteByVal(int data) {
		if (head == null) {
			return false;
		}
		// if the deletable node os the first node that is the head node
		if (head.getData() == data) {
			head = head.getNext();
			return true;
		}
		// other than the head node
		Node prev = head;
		Node deletable = head;
		while (deletable.getData() != data) {
			prev = deletable;
			deletable = deletable.getNext();
			if (deletable == null) {
				return false;
			}
		}
		prev.setNext(deletable.getNext());
		return true;
	}

	// deleting by th position

	public boolean deleteByPos(int pos) {
		if (head == null || pos < 0) {
			return false;
		}
		if (pos == 1) {
			head = head.getNext();
			return true;
		}
		Node prev = head;
		for (int i = 1; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev.getNext() == null) {
				return false;
			}
		}
		Node del = prev.getNext();
		prev.setNext(del.getNext());
		return true;
	}

}
