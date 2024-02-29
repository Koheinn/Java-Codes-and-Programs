package basicJava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
//		Scanner ip=new Scanner(System.in);
//		System.out.println("Enter number: ");
//		int num=ip.nextInt();
		for(int i=0;i<=5;i++) {
			factorial(i);
		}
		
	
		
//      for(int i=2;i<20;i++) {
//    	  if(checkIsPrime(i)) {
//    		  System.out.printf("%d,",i);
//    	  }
//    	  
//      }
//	}
//	static private boolean checkIsPrime(int num) {
//		int i=2;
//		   while(num%i!=0) {
//			   i++;
//		   }
//		   if(num==i)
//			   return true;
//			   else
//		       return false;
//		
//	}

}
	static void factorial(int num) {
		double fact=1;
		for(int i=num;i>=1;i--) {
			fact*=i;
		}
		System.out.printf("%d!=%.2f\n",num,fact);
	}
	
}
