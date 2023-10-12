import java.util.Stack;

public class SimpleStackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the stack
        int poppedValue = stack.pop();
        System.out.println("Popped: " + poppedValue);
        


        // // Peek at the top element
        int topValue = stack.peek();
        System.out.println("Top element: " + topValue);

        // // Check if the stack is empty
        // boolean isEmpty = stack.isEmpty();
        // System.out.println("Is the stack empty? " + isEmpty);
    }
}