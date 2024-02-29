package basicJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ArrayDemoExercise {

	public static void main(String[] args) {
		Integer numArr[]= {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
		System.out.println("Before sorting:");
		display(numArr);
		//Arrays.sort(numArr);
		Arrays.sort(numArr,Collections.reverseOrder());
		System.out.println("\nAfter sorting reversed:");
		display(numArr);

	}
	static void display(Integer num[]) {
		System.out.print("{");
		System.out.print(num[0]);
		for(int i=1;i<num.length;i++)
		System.out.printf(",%d",num[i]);
		System.out.print("}");	
	}

}
