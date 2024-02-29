package basicJava;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int x=ip.nextInt();
		int y=ip.nextInt();
		int gcd=1;
		int max=Math.max(x, y);
		for(int i=2;i<=max/2;i++) {
			if(x%i==0 && y%i==0)
				gcd=i;
		}
		System.out.println("GCD of two input numbers "+x+" and "+y+" is "+gcd);

	}

}
