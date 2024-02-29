package basicJava;

import java.util.Scanner;

public class PrintSquare {

	public static void main(String[] args) {
//for(int i=5;i>=-5;i--) {
//	System.out.printf("%d ",i);
//}
//Scanner ip=new Scanner(System.in);
//System.out.println("Enter a number");
//int num=ip.nextInt();
//for(int i=1;i<=12;i++) {
//	System.out.printf("%d x %2d=%3d\n",num,i,(num*i));
//}
//		for(int i=0;i<5;i++) {
//			for(int j=i+1;j<=5+i;j++) {
//				System.out.printf("%d ",j);
//			}
//			System.out.println();
//		}
		for(int i=1;i<=7;i+=2) {
			for(int j=i;j<=7;j+=2) {
				System.out.printf("%d ",j);
			}
			System.out.println();
		}

	}

}
