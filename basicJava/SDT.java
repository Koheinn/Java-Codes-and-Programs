package basicJava;

import java.util.Scanner;

public class SDT {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=ip.nextInt();
		for(int counter=1;counter<=num;counter++) {
			for(int j=0;j<counter;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
