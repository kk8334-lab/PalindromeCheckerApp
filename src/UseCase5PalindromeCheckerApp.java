import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push each character into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Variable to store reversed string
        String reversed = "";

        // Pop characters from stack (LIFO)
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}