package simpleLinkedList;

public class TesterLinkedList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.insert(60);
		// ll.display();
		ll.insertAtPos(25, 3);
		// ll.dispRev();
		ll.display();
		System.out.println("after delete by value");
		ll.deleteByVal(25);
		ll.display();
		System.out.println("after delete by position");
		ll.deleteByPos(5);
		ll.display();
	}
}
