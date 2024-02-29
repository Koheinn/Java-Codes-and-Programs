package basicJava;

import java.util.Scanner;

public class LoopingOne {
	static double ip1,ip2;
	static Scanner ip;
	public static void main(String[] args) {
		int sum=0;
//		for(int i=1;i<=10;i++) {
//			sum+=i;
//		}
//		int i=1;
//		while(i<=10) {
//			sum+=i;	
//			i++;
//			
//		}
//		System.out.println(sum);
		
		
		
	    ip=new Scanner(System.in);
	    char ch = 0;
	    do{
	    	System.out.println("Choose one operation form menu:");
			System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
			int operation=ip.nextInt();
			switch(operation) {
			case 1:{
				 getInputs();
				System.out.println("Sum of two number "+(ip1+ip2));break;}
			case 2:
				{getInputs();
				 System.out.println("Subtract second number from first number "+(ip1-ip2));break;}
			case 3:
				{getInputs();
					System.out.println("Multiply two numbers "+(ip1*ip2));break;}
			case 4:{getInputs();
				System.out.println("Divide first by second number "+(ip1/ip2));break;}
			default:System.out.println("Invalid inputs");
			}
			System.out.println("Do another yes(y) or no(n) ");
			ch=ip.next().toLowerCase().charAt(0);
   } while(ch=='y');
		
	}
	static private void getInputs() {
		System.out.println("Enter operands: ");
		ip1=ip.nextDouble();
		ip2=ip.nextDouble();
	}

}
