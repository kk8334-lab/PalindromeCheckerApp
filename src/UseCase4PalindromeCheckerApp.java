public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "radar";

        // Convert string to character array
        char[] characters = word.toCharArray();

        // Flag to check palindrome condition
        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < characters.length / 2; i++) {

            if (characters[i] != characters[characters.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}