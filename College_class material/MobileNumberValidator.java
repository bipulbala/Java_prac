import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileNumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mobile number: ");
        String mobileNumber = scanner.nextLine();

        MobileNumberValidator validator = new MobileNumberValidator();
        boolean isValid = validator.isValidMobileNumber(mobileNumber);

        if (isValid) {
            System.out.println("The mobile number is valid.");
        } else {
            System.out.println("The mobile number is not valid.");
        }

        scanner.close();
    }

    public boolean isValidMobileNumber(String mobileNumber) {
        // Define the regular expression for a valid mobile number
        String regex = "^[6-9]\\d{9}$";
        return Pattern.matches(regex, mobileNumber);
    }
}