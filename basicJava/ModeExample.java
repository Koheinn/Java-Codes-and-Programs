package basicJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModeExample {
	public static List<Integer> calculateMode(int[] numbers) {
        
 
        // Sort the array to simplify finding modes
        Arrays.sort(numbers);
 
        int currentNumber = numbers[0];
        int currentCount = 1;
        int maxCount = 1;
 
        List<Integer> modes = new ArrayList<>();
        modes.add(currentNumber);
 
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == currentNumber) {
                currentCount++;
            } else {
                currentNumber = numbers[i];
                currentCount = 1;
            }
 
            if (currentCount > maxCount) {
                maxCount = currentCount;
                modes.clear();
                modes.add(currentNumber);
            } else if (currentCount == maxCount) {
                modes.add(currentNumber);
            }
        }
 
        return modes;
    }
 
	public static void main(String[] args) {
		int[] numbers = {5, 9, 1, 7, 6, 3, 8, 4};
		 
        List<Integer> modes = calculateMode(numbers);
 
        System.out.println("Modes: " + modes);
	}

}
