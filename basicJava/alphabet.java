package basicJava;

import java.util.Scanner;

public class alphabet {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter an alphabet: ");
	char alpha=input.next().charAt(0);
	alpha=Character.toLowerCase(alpha);
	if (Character.isLetter(alpha)) {
		if (alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u') {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonant");
		}
	}else {
		System.out.println("Enter Alphabet!");
	}
}
}
