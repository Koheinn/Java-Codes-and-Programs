package basicJava;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExercise3 {

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter length of aray:");
        int size=ip.nextInt();
        int num[]=new int[size];
        //display(num);
        for(int i=0;i<size;i++) {
        	System.out.println("Enter a number");
        	num[i]=ip.nextInt();
        }
        display(num);
        System.out.println("\nAfter sorting in decsending order");
        Arrays.sort(num);
        for(int i=size-1;i>=0;i--) {
        	System.out.printf("%d,",num[i]);
        }

}
	static void display(int num[]) {
		System.out.print("{");
		System.out.print(num[0]);
		for(int i=1;i<num.length;i++)
		System.out.printf(",%d",num[i]);
		System.out.print("}");	
	}
}
