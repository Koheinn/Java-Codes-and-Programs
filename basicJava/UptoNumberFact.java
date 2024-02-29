package basicJava;

import java.util.Scanner;

public class UptoNumberFact {

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=ip.nextInt();
		boolean isPrime=true;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0)
				isPrime=false;
		}
		if (isPrime)
			System.out.println("Prime ");
		else
			System.out.println("Not Prime ");
		
		
//		for(int counter1=1;counter1<=number;counter1++) {
//			  int fact=1;
//			for(int counter2=1;counter2<=counter1;counter2++) {
//				fact*=counter2;
//			}
//			System.out.println(counter1+"!="+fact);
//		}
//		

	}

}
