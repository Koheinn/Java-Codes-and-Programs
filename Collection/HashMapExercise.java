package Collection;
import java.util.*;

public class HashMapExercise {
    private Map<String, Integer> wordOccurrences;

    public HashMapExercise() {
        wordOccurrences = new HashMap<>();
    }

    public void countOccurrences(String input) {
        String[] words = input.split("\\W+");
        for (String word : words) {
            word = word.toLowerCase();
            wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
        }
    }

    public void displayOccurrences() {
        System.out.println("Word occurrences:");
        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = ip.nextLine();

        HashMapExercise wordCounter = new HashMapExercise();
        wordCounter.countOccurrences(input);
        wordCounter.displayOccurrences();
    }
}

