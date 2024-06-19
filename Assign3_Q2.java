//2. In singly linear list implement following operations. i. insert a new node after a given node ii. insert a
//new node before a given node
class Node1{
	int data;
	Node1 next;
	public Node1(int data) {
		this.data = data;
		this.next = null;
	}
}
public class Assign3_Q2 {
	private Node1 head;
	public Assign3_Q2() {
		this.head = null;
	}
	public void addToEnd(int data) {
		Node1 newNode = new Node1(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node1 current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void insertAfter(Node1 prevNode, int data){
		if(prevNode == null) {
			System.out.println("given previous node cannot be null");
		}
		else {
			Node1 newNode = new Node1(data);
			newNode.next = prevNode.next;
			prevNode.next = newNode;
		}
	}
	public void insertBefore(Node1 nextNode, int data) {
		Node1 newNode = new Node1(data);
		if(nextNode == null || head == null){
			System.out.println("Given nextNode cannot be empty");
		}
		else if(nextNode == head){
			newNode.next = head;
			head = newNode;
		}
		else {
			Node1 current = head;
			do {
				current = current.next;
			}while(current.next != nextNode);
			newNode.next = current.next;
			current.next = newNode;
		}
		
	}
	public void display() {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node1 current = head;
			while(current != null) {
				System.out.println(current.data + " ");
				current = current.next;
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign3_Q2 list = new Assign3_Q2();
        list.addToEnd(10);
        list.addToEnd(20);
        list.addToEnd(30);
        list.display();
        
        Node1 firstNode = list.head;
        list.insertAfter(firstNode, 15);
        list.display();
        
        Node1 secondNode = list.head.next.next; // Node with value 20
        list.insertBefore(secondNode, 18);
        list.display();

	}

}
