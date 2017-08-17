package stack;

import java.util.Collections;
import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
	// https://www.tutorialspoint.com/java/java_stack_class.htm

	Stack<Integer> stack = new Stack<>();

	// push
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(4);
	stack.push(5);
	System.out.println(stack);
	System.out.println("index of 1: " + stack.search(1));
	Collections.binarySearch(stack, 1);
	// isEmpty
	System.out.println("isEmpty: " + stack.isEmpty());

	// peek
	System.out.println("peek: " + stack.peek());
	System.out.println(stack);

	// pop
	System.out.println("pop: " + stack.pop());
	System.out.println(stack);

	// search
	System.out.println("index of 8: " + stack.search(8));
	System.out.println("index of 1: " + stack.search(1));
    }
}
