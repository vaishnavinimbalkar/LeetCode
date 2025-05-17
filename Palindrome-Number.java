import java.util.Scanner;

public class Solution {

    // Method to check if the integer is a palindrome
    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false; // false
        }

        int reversed = 0, original = x;

        // Reverse the integer
        while (x != 0) {
            int remainder = x % 10;                // Get the last digit
            reversed = reversed * 10 + remainder;  // Build the reversed number
            x /= 10;                                // Remove the last digit
        }

        // Return true if original and reversed are equal, otherwise false
        return original == reversed; // true or false
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = scanner.nextInt(); // Take input from the user

        // Check if the input number is a palindrome
        if (isPalindrome(x)) {
            System.out.println("True");  // If true
        } else {
            System.out.println("False"); // If false
        }

        scanner.close(); // Close the scanner
    }
}