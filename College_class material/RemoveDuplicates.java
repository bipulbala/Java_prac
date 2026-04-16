import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        RemoveDuplicates remover = new RemoveDuplicates();
        String result = remover.removeDuplicates(inputString);

        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }

    public String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }
}