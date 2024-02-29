package basicJava;

import java.util.Scanner;

public class CounterLetters {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int spCount=0;
		int vowels=0;
		int consonants=0;
		int digitCount=0;
		String vowel="aeiou";
		System.out.println("Enter text: ");
		String inputString=ip.nextLine();
		for(int i=0;i<inputString.length();i++) {
			char ch=inputString.charAt(i);
			if(Character.isDigit(ch)) {
				digitCount++;
				
			}
			else {
				if(vowel.contains(""+ch)) {
					vowels++;	
				}
				else if(ch==' ') {
					spCount++;
				}
				else {
					consonants++;
				}
			}
		}
		System.out.printf("Vowels count is %d\nConsonants count is %d\nSpace count is %d\nDigit count is %d",vowels,consonants,spCount,digitCount);

	}

}
