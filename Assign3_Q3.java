import java.util.Stack;

class Node3{
	int data;
	Node3 next;
	
	public Node3(int data) {
		this.data = data;
		next = null;
	}
}
public class Assign3_Q3 {
	Node3 head;
	public void addToEnd(int data) {
		Node3 newNode = new Node3(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node3 current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void display() {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node3 current = head;
			while(current != null) {
				System.out.println(current.data + " ");
				current = current.next;
			}
		}
	}
	public void displayReverse() {
		System.out.println("List in reverse order : ");
		displayReverseRecursive(head);
	}
	private void displayReverseRecursive(Node3 node) {
		if(node == null) {
			return;
		}
		displayReverseRecursive(node.next);
		System.out.println(node.data + " ");
	}
	
	public void displayReverseUsingStack() {
		Stack <Node3>stack = new Stack<>();
		Node3 current = head;
		while(current != null) {
			stack.push(current);
			current = current.next;
		}
		while(!stack.isEmpty()) {
			Node3 node = stack.pop();
			System.out.println(node.data + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Assign3_Q3 list = new Assign3_Q3();
	        list.addToEnd(10);
	        list.addToEnd(20);
	        list.addToEnd(30);
	        list.addToEnd(40);

	        System.out.print("Original list: ");
	        list.display();

	        list.displayReverse();

	        list.displayReverseUsingStack();		

	}

}
