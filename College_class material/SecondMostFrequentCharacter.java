import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondMostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        SecondMostFrequentCharacter finder = new SecondMostFrequentCharacter();
        char result = finder.findSecondMostFrequentCharacter(inputString);

        if (result != '\0') {
            System.out.println("The second most frequent character is: " + result);
        } else {
            System.out.println("No second most frequent character found.");
        }

        scanner.close();
    }

    public char findSecondMostFrequentCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        }

        // Count frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the most frequent and second most frequent characters
        char mostFrequentChar = '\0';
        char secondMostFrequentChar = '\0';
        int maxFrequency = 0;
        int secondMaxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                secondMaxFrequency = maxFrequency;
                secondMostFrequentChar = mostFrequentChar;
                maxFrequency = frequency;
                mostFrequentChar = entry.getKey();
            } else if (frequency > secondMaxFrequency && frequency < maxFrequency) {
                secondMaxFrequency = frequency;
                secondMostFrequentChar = entry.getKey();
            }
        }

        return secondMostFrequentChar;
    }
}