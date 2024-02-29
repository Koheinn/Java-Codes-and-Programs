package basicJava;

import java.util.Scanner;

public class arrayExercise {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter total number of rows :");
		int row=ip.nextInt();
		System.out.println("Enter total number of columns :");
		int col=ip.nextInt();
		int ele[][]=new int[row][col];
		int r,c=1;
		for(r=1;r<=row;r++) {
			for(c=1;c<=col;c++) {
				System.out.println("Enter element for array["+r+","+c+"] :");
				ele[r-1][c-1]=ip.nextInt();
			}
		}
		System.out.println("You have entered :");
		for(r=1;r<=row;r++) {
			for(c=1;c<=col;c++) {
				System.out.print(ele[r-1][c-1]+"   ");
			}
			System.out.println();
		}
		System.out.println("The boundary elements of this matrix are :");
		int mid=ele.length;
		for(int i=0;i<mid;i++) {
			int n=ele[i].length;
			for(int j=0;j<n;j++) {
				if(i==0)
					System.out.printf("%2d ",ele[i][j]);
				else if(i==mid-1)
					System.out.printf("%2d ",ele[i][j]);
				else if(j==0)
					System.out.printf("%2d ",ele[i][j]);
				else if(j==n-1)
					System.out.printf("%2d ",ele[i][j]);
				else
					System.out.printf("   ");
			}
			System.out.println();
		}
		
	}

}
