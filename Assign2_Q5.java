

class Assign2_Q5 {
    private int SIZE; 
    private int[] stackArray; 
    private int top;
    public Assign2_Q5(int size) {
        SIZE = size;
        stackArray = new int[SIZE];
        top = SIZE; 
    }

   
    public boolean isEmpty() {
        return top == SIZE;
    }

    public boolean isFull() {
        return top == 0;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
            return;
        }
        top--; 
        stackArray[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        }
        int poppedValue = stackArray[top];
        top++; 
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a default value indicating stack underflow
        }
        return stackArray[top];
    }

 
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i < SIZE; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	Assign2_Q5 stack = new Assign2_Q5(5);

        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        
        stack.display();

       
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        
        stack.display();
        stack.push(40);
        stack.push(50);
        stack.display();

       
        System.out.println("Top element: " + stack.peek());
    }
}
