package basicJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemoo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your inputs as two numbers:");
		
		
		int result=0;
		
		try{
			int f=input.nextInt();
			int s=input.nextInt();
			result = f / s;		
			String ip="3";
			int num=Integer.parseInt(ip);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.err.println("Arithmetic exception occurs!");
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			System.err.println("Input Mismatch exception occurs");
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
			System.err.println("Number format exception occurs");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Something went wrong");
		}
		finally {
			System.out.println("Thank you");
		}
		System.out.println("Result is " + result);
		System.out.println("Than you for your attention");

	}

}
