public class Assign4_Q2 {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	private Node tail;
	public Assign4_Q2() {
		head = tail = null;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void addFirst(int value) {
		//1. create node
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty())
			// add newnode into head and tail
			head = tail = newnode;
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into prev of first node
			head.prev = newnode;
			//c. move head on newnode
			head = newnode;
		}
	}
	
	public void addLast(int value) {
		//1. create node
		Node newnode = new Node(value);
		//2. if empty
		if(isEmpty())
			// add newnode into head and tail
			head = tail = newnode;
		//3. if not empty
		else {
			//a. add last node into prev of newnode
			newnode.prev = tail;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move tail on newnode
			tail = newnode;
		}
	}
	
	public void deleteFirst() {
		//1. if empty
		if(isEmpty())
			return;
		//2. if single node
		else if(head == tail)
			head = tail = null;
		//3. if multiple nodes
		else {
			//a. move head on second node
			head = head.next;
			//b. make prev of second node null
			head.prev = null;
		}

	}
	
	public void deleteLast() {
		//1. if empty
		if(isEmpty())
			return;
		//2. if single node
		else if(head == tail)
			head = tail = null;
		//3. if multiple nodes
		else {
			//a. move tail on second last node
			tail = tail.prev;
			//b. make next of second last node null
			tail.next = null;
		}
	}

	public void Display() {
		// forward traversal
		//1. create trav and start at head
		Node trav = head;
		System.out.print("List : ");
		while(trav != null) {
			//2. visit/print data of current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	


	public static void main(String[] args) {
		
		Assign4_Q2 l1 = new Assign4_Q2();
		
		
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		System.out.print("Add First Implementation :");
		l1.Display();
		
		l1.addLast(50);
		l1.addLast(60);
		
		System.out.print("Add Last Implementation :");
		l1.Display();
		
		l1.deleteFirst();
		
		System.out.print("Delete first Implementation :");
		l1.Display();
		
		l1.deleteLast();
		System.out.print("Delete last Implementation :");
		l1.Display();
		
	}

}



























