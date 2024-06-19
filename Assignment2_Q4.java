package mypackage;

import java.util.Scanner;

class Queue{
	private int arr[];
	private int front, rear;
	private int Size;
	public Queue(int size) {
		front = rear = -1;
		Size = size;
		arr = new int[Size];
	}
	
	public void push(int n){
		rear = rear +1;
		arr[rear] = n;
	}
	
	public int pop(){
		int value = arr[front+1];
		front++;
		return value;
		
	}
	public int peek() {
		return arr[front+1];
	}
	public boolean isEmpty() {
		return front==rear;
	}
	public boolean isFull() {
		return front == Size-1;
	}
}
public class Assignment2_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(4);
		int choice;
		
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. exit\n1. push\n2. pop\n3. peek");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
            
			switch(choice) {
			case 1:
				if(q.isFull()) {
					System.out.println("Queue is full");
				}
				else {
					System.out.print("Enter value to be inserted : ");
					int value = sc.nextInt();
					q.push(value);

				}
			
			break;
			
			case 2:
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println("Poped data : " + q.pop());
				break;
				
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println("Peeked data : " + q.peek());
				break;
			}

		}while(choice != 0);

	}

}
