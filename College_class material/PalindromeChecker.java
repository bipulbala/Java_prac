import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker();
        boolean isPalindrome = checker.isPalindrome(inputString);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    public boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        String reversedString = new StringBuilder(str).reverse().toString();
        return str.equals(reversedString);
    }
}