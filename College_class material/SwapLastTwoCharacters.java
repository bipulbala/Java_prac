import java.util.Scanner;

public class SwapLastTwoCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        SwapLastTwoCharacters swapper = new SwapLastTwoCharacters();
        String result = swapper.swapLastTwoCharacters(inputString);

        System.out.println("String after swapping last two characters: " + result);

        scanner.close();
    }

    public String swapLastTwoCharacters(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }

        int len = str.length();
        return str.substring(0, len - 2) + str.charAt(len - 1) + str.charAt(len - 2);
    }
}