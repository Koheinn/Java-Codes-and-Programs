package basicJava;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a number");
		String inputString=ip.next();
		int sum=0;
		for(int i=inputString.length()-1;i>=0;i--) {
			System.out.printf("%s",inputString.charAt(i));
			sum+=Integer.parseInt(""+inputString.charAt(i));		
		}
		System.out.println("\nSum="+sum);
	}
}
