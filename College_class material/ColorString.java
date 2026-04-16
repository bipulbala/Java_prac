import java.util.Scanner;

public class ColorString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        ColorString colorChecker = new ColorString();
        String result = colorChecker.checkColor(inputString);

        System.out.println("Result: " + result);

        scanner.close();
    }

    public String checkColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("black")) {
            return "black";
        } else {
            return "";
        }
    }
}