import java.util.Stack;

class Assign2_Q6 {
    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;

    public Assign2_Q6() {
        mainStack = new Stack<>();
        maxStack = new Stack<>();
    }
    public void push(int value) {
        mainStack.push(value);
        if (maxStack.isEmpty() || value >= maxStack.peek()) {
            maxStack.push(value);
        }
    }

    public int pop() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        int poppedValue = mainStack.pop();
        if (poppedValue == maxStack.peek()) {
            maxStack.pop();
        }
        return poppedValue;
    }

    public int getMax() {
        if (maxStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty. No max value.");
        }
        return maxStack.peek();
    }
    public static void main(String[] args) {
    	Assign2_Q6 stack = new Assign2_Q6();


        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.push(1);

        int max = stack.getMax();
        System.out.println("Maximum value in stack: " + max);

        stack.pop();
        stack.pop();
        max = stack.getMax();
        System.out.println("Maximum value in stack after popping: " + max);
    }
}
