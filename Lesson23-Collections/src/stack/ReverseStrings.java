package stack;

import java.util.Scanner;
import java.util.Stack;

//https://softuni.bg/trainings/resources/officedocument/11863/lab-problem-descriptions-java-advanced-january-2017

public class ReverseStrings {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String string = scanner.nextLine();

	Stack<Character> stack = new Stack<>();

	for (Character character : string.toCharArray()) {
	    stack.push(character);
	}

	while (!stack.isEmpty()) {
	    System.out.print(stack.pop());
	}
    }
}
