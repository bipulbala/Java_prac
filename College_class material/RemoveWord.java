import java.util.Scanner;

public class RemoveWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the word to be removed: ");
        String wordToRemove = scanner.nextLine();

        RemoveWord remover = new RemoveWord();
        String result = remover.removeWord(originalString, wordToRemove);

        System.out.println("String after removing the word: " + result);

        scanner.close();
    }

    public String removeWord(String str, String word) {
        if (str == null || word == null || str.isEmpty() || word.isEmpty()) {
            return str;
        }

        return str.replace(word, "").trim();
    }
}