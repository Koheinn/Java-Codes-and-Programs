package basicJava;

import java.io.*;
import java.util.Scanner;

public class PyramidPattern
{
	
	public static void printTriangle(int n)
	{
		for (int i=0; i<n; i++)
		{
			for (int j=n-i; j>1; j--)
			{
				// printing spaces
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++ )
			{
				// printing stars
				System.out.printf("* ");
			}

			// ending line after each row
			System.out.println();
		}
	}
	
	// Driver Function
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=ip.nextInt();
		for(int i=1;i<=num;i++)
		{
			printTriangle(i);
		}
		
	}
}
