//1. Implement singly circular linked list using tail pointer (no head pointer). Compare time complexities of
//all operations.
class Node4 {
	int data;
	Node4 next;
	public Node4(int data){
		this.data = data;
		this.next = null;
	}
	
}
public class Assign3_Q1 {
    private Node4 tail;
    public Assign3_Q1() {
    	this.tail = null;
    }
    public boolean isEmpty() {
    	return tail == null;
    }
    public void addToEmpty(int data){
    	if(!isEmpty()) {
    		return;
    	}
    	Node4 newnode = new Node4(data);
    	tail = newnode;
    	tail.next = tail;
    }
    public void addToEnd(int data) {
    	if(isEmpty()) {
    		addToEmpty(data);
    		return;
    	}
    	Node4 newNode = new Node4(data);
    	newNode.next = tail.next;
    	tail.next = newNode;
    	tail = newNode;
    	
    }
    public void addToBeginning(int data){
    	if(isEmpty()) {
    		addToEmpty(data);
    		return;
    	}
    	Node4 newNode = new Node4(data);
    	newNode.next = tail.next;
    	tail.next = newNode;
    }
    public void deleteFromBeginning() {
    	if(isEmpty()) {
    		System.out.println("List is Empty");
    	}
    	else {
    		tail.next = tail.next.next;
    	}
    }
    public void deleteFromEnding() {
    	if(isEmpty()) {
    		System.out.println("List is Empty");
    	}
    	else {
    		Node4 current = tail.next;
    		while(current.next != tail) {
    			current = current.next;
    		}
    		current.next = tail.next;
    		tail = current;
    	}
    }
    public void display() {
    	if(isEmpty()) {
    		System.out.println("List is empty");
    	}
    	else {
    		Node4 current=tail.next;
    		do{
    			System.out.println(current.data + " ");
    			current = current.next;
    		}
    		while(current!= tail.next);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Assign3_Q1 list = new Assign3_Q1();
        list.addToEnd(10);
        list.addToEnd(20);
        list.addToBeginning(5);
        list.display(); 

        list.deleteFromBeginning();
        list.display(); 

        list.deleteFromEnding();
        list.display(); //

	}

}
