package basicJava;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=ip.nextInt();
		int sum=0;
		while(num!=0)
		{
			int remain=num%10;
			System.out.printf("%d", remain);
			sum+=remain;
			num=num/10;
		}
		System.out.println("\nThe sum of all digits: "+sum);
	}

}
