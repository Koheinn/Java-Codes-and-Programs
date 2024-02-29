package basicJava;

import java.util.Scanner;

public class Fibonacci_sequences {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first term to produce Fibonacci sequence : ");
		int first_term=input.nextInt();
		System.out.println("Enter second term to produce Fibonacci sequence : ");
		int second_term=input.nextInt();
		System.out.println("Enter number of terms to produce Fibonacci sequence : ");
		int noOfterms=input.nextInt();
		System.out.println("Fibonacci Sequence");
		System.out.print(first_term+" , "+second_term);
		for (int i=2;i<noOfterms;i++) {
			int next=first_term+second_term;
			System.out.print(" , "+next);
			first_term=second_term;
			second_term=next;
		}
	}

}
