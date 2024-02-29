package basicJava;

import java.util.Arrays;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=ip.nextInt();
		int num[]=new int[size];
		System.out.println("Enter array elements(eg, 1 2 3 4): ");
		for(int i=0;i<size;i++) {
			num[i]=ip.nextInt();
		}
		System.out.println("Before sorting..");
		
       display(num);
       Arrays.sort(num);
       System.out.println();
       System.out.println("After sorting in decending order");
       reversedisplay(num);
       System.out.println("\nAverage of input elements:"+getAvg(num));
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
static double getAvg(int n[]) {
	double avg=0.0;
	int sum=0;
	for(int i:n) {
		sum+=i;
	}
	avg=(double)sum/n.length;
	return avg;
	
}

}
