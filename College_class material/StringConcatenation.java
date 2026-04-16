import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        StringConcatenation concatenator = new StringConcatenation();
        String result = concatenator.concatenateStrings(firstString, secondString);

        System.out.println("Concatenated String: " + result);

        scanner.close();
    }

    public String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }
}