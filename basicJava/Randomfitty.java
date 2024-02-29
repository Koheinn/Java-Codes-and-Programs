package basicJava;

import java.util.Arrays;
import java.util.Random;

public class Randomfitty {

	public static void main(String[] args) {
		Random rd=new Random();
		int num[]=new int[50];
		for(int i=0;i<50;i++) {
			num[i]=rd.nextInt(100);
		}
		display(num);
		Arrays.sort(num);
		System.out.println();
		System.out.println("After sorting in descending order");
		reversedisplay(num);
		ten(num);
		System.out.println();
		System.out.println("The  sum of Odd Numbers: ");
		sumOfOdd(num);
	}
	static void display(int n[]) {
		for(int i:n) {
			System.out.printf("%d,",i);
		}
	}
	static void reversedisplay(int n[]) {
		for(int i=n.length-1;i>=0;i--)
			System.out.printf("%d,",n[i]);
	}
	static void ten(int n[]) {
		int c=10;
		for(int i=0;i<n.length;i++) {
			System.out.printf("%2d,",n[i]);
			if(i%10==0) {
				System.out.println();
			}
		}
	}
	static void sumOfOdd(int n[]) {
		int sum=0;
		for(int i:n) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
