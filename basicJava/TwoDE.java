package basicJava;

import java.util.Scanner;

public class TwoDE {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter total number of rows:");
		int rows=ip.nextInt();
		System.out.println("Enter total number of cols:");
		int cols=ip.nextInt();
		int num[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++) {
				System.out.printf("Enter element for array[%d,%d]:",(i+1),(j+1));
				num[i][j]=ip.nextInt();
			}
		}
		System.out.println("You have entered:");
		display(num);
		System.out.println("The boundary elements of this matrix are:");
		printBoundary(num);
	}
	static void display(int n[][]) {
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.printf("%2d ",n[i][j]);
			}
			System.out.println();
		}
	}

	public static void printBoundary(int a[][]) {
		int m=a.length;
		
		for (int i = 0; i < m; i++) {
			int n=a[i].length;
			for (int j = 0; j < n; j++) {
				if (i == 0)
					System.out.printf("%2d ",a[i][j]);
					//System.out.print(a[i][j] + " ");
				else if (i == m - 1)
					System.out.printf("%2d ",a[i][j]);
				else if (j == 0)
					System.out.printf("%2d ",a[i][j]);
				else if (j == n - 1)
					System.out.printf("%2d ",a[i][j]);
				else
					System.out.printf("   ");
			}
			System.out.println();
		}
	}

}
