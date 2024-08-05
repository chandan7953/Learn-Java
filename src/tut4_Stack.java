import java.util.Stack;

public class tut4_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // To add elements to the stack
        stack.push(21);
        stack.push(22);
        stack.push(24);
        stack.push(25);

        int num = 0;
        stack.push(num);

        // To delete element from stack
        stack.pop();

        // To check if the stack is empty or not
        while (!stack.empty()) {

            // To check the size of the stack
            System.out.println("The size of stack -> " + stack.size());

            // To see the top element in the stack
            System.out.println("The top element of stack -> " + stack.peek() + " ");

            stack.pop();

            System.out.println();
        }
    }
}
