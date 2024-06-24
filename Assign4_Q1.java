public class Assign4_Q1 {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	
	public Assign4_Q1() {
		head = null;
	}
	
	public boolean IsEmpty() {
		return head == null;
	}
	
	public void addFirst(int value) {
		//1. create newnode for given value
		Node newnode = new Node(value);
		//2. add first node into next of newnode
		newnode.next = head;
		//3. move head on newnode
		head = newnode;
	}
	public void deleteFirst() {
		//0. if list is empty
		if(IsEmpty())
			return;
		//1. if list is not empty
		else
			//a. move head on second node
			head = head.next;
	}
	
	
	public void deleteLast() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head.next == null)
			head = null;
		//3. if list has multiple node
		else {
			//a. traverse till second last node
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			//b. add null into next of second last node
			trav.next = null;
		}
	}
	public void display() {
		//1. create trav and start at head
		Node trav = head;
		System.out.print("List :: ");
		while(trav != null) {
			//2. visit/print data of current node (trav.data)
			System.out.print(" " + trav.data);
			//3. go on next node (trav.next)
			trav = trav.next;
		}//4. repeat step 2 and 3 till last node of list
		System.out.println("");
	}
	

	
	
	
	
public static void main(String[] args) {
	
	Assign4_Q1 l1 = new Assign4_Q1();
	
	l1.addFirst(40);
	l1.addFirst(30);
	l1.addFirst(20);
	l1.addFirst(10);
	// 10 -> 20 -> 30 -> 40

	l1.display();
	l1.deleteFirst();
	
l1.display();

l1.deleteLast();

l1.display();

}
}


