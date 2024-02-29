package basicJava;

import java.util.Scanner;

public class DigitsConverter {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a number");
		String inputString=ip.next();
		int sum=0;
		for(int i=inputString.length()-1;i>=0;i--) {
			System.out.printf("%s",inputString.charAt(i));
			sum+=Integer.parseInt(""+inputString.charAt(i));
			//String.valueOf(inputString.charAt(i));
			}
		System.out.println("\nSum="+sum);
		}
//		int num=ip.nextInt();
//		int sum=0;
//		while(num!=0)
//		{
//			int remain=num%10;
//			System.out.printf("%d",remain);
//			sum+=remain;
//			num=num/10;
//		}
//		System.out.println("\nThe sum of all digits: "+sum);
//	}

}
