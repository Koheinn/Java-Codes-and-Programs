package basicJava;

import java.util.Scanner;

public class CharToAscii {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=ip.next().charAt(0);
		System.out.println("ASCII value of input character is "+(int)ch);

	}

}
