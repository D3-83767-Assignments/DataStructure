package com.app.Assignment62;

public class PriorityQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Priorityqueue q = new Priorityqueue(9);
		
		
		q.push(6);
		q.push(14);
		q.push(3);
		q.push(26);
		
		System.out.println("Peeked data : " + q.peek());
		System.out.println("Poped data : " + q.pop());
		System.out.println("Peeked data : " + q.peek());

	}

}
