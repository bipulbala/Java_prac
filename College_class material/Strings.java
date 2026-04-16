import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter 2nd string: ");
        String str2 = sc.nextLine();

        String str3 = str1 + " " + str2;
        System.out.println("The concatenated string is: " + str3);
        // Close the scanner to prevent resource leak
        sc.close();
        System.out.println("Do not sleep  can" );
    }
}