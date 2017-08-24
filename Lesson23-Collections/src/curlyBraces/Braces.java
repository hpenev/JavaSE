package curlyBraces;

import java.util.Stack;

public class Braces {
    public static void main(String[] args) {
	Stack<Character> braces = new Stack<>();

	String code = "{{}{}}";

	boolean hasEndBrace = false;

	for (Character character : code.toCharArray()) {
	    if (character == '{') {
		braces.push(character);
	    }
	    if (character == '}') {
		if (braces.isEmpty()) {
		    hasEndBrace = true;
		    break;
		}
		braces.pop();
	    }
	}

	if (!hasEndBrace && braces.isEmpty()) {
	    System.out.println("OK");
	} else {
	    System.out.println("NOT OK");

	}
    }
}
