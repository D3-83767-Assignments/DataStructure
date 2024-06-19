class Node5{
	int data;
	Node5 next;
	public Node5(int data){
		this.data = data;
		next = null;
	}
}
public class Assign3_Q4 {
	Node5 head = null;
	
//	 public void insertSorted(int data) {
//	        Node5 newNode = new Node5(data);
//	        // If the list is empty or the new node should be inserted at the beginning
//	        if (head == null || head.data >= newNode.data) {
//	            newNode.next = head;
//	            head = newNode;
//	        } else {
//	            // Traverse the list to find the correct position
//	            Node5 current = head;
//	            while (current.next != null && current.next.data < newNode.data) {
//	                current = current.next;
//	            }
//	            newNode.next = current.next;
//	            current.next = newNode;
//	        }
//	    }
	 
	public void insertSorted2(int data) {
		 Node5 newNode = new Node5(data);
		 if(head == null || head.data > data) {
			 newNode.next = null;
			 head = newNode;
		 }
		 else {
			 Node5 curr = head;
			 while(curr.next != null && curr.next.data < data) {
				 curr = curr.next;
			 }
			 newNode.next = curr.next;
			 curr.next=newNode;
		 }
	}
	
	public void display() {
	    if (head == null) {
	        System.out.println("List is empty");
	    } else {
	        Node5 current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println(); // Move to the next line after printing the list
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign3_Q4 list = new Assign3_Q4();
		list.insertSorted2(10);
		list.insertSorted2(20);
		list.insertSorted2(30);
		list.insertSorted2(40);
		list.display();
        
	}

}
