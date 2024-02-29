package basicJava;

import java.util.Scanner;

public class PrimeNumberList {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=ip.nextInt();
		for(int i=2;i<=num;i++) {
			
			if(isPrime(i))
			{
				System.out.println(i+" is a prime number");
			}
			else
			{
				System.out.println(i+" is not a prime number");
			}
			
		}

	}
static boolean isPrime(int num) {
	int divisor=2;
	while(!(num%divisor==0)){
		
		divisor++;
	}
	if(num==divisor) 
	return true;		
	else return false;
		
}
}
