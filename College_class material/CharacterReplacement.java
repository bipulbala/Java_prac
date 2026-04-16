import java.util.Scanner;

public class CharacterReplacement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the original string: ");
		String originalString = scanner.nextLine();

		System.out.print("Enter the character to be replaced: ");
		char oldChar = scanner.next().charAt(0);

		System.out.print("Enter the replacement character: ");
		char newChar = scanner.next().charAt(0);

		CharacterReplacement replacer = new CharacterReplacement();
		String result = replacer.replaceCharacter(originalString, oldChar, newChar);

		System.out.println("Modified String: " + result);

		scanner.close();
	}

	public String replaceCharacter(String str, char oldChar, char newChar) {
		return str.replace(oldChar, newChar);
	}
}