package basicJava;

import java.util.Scanner;

public class TestCustomException {
static void validate(int age) throws InvalidAgeException {
	if(age<0 || age>100)
	{
		throw new InvalidAgeException("Age is not valid");
	}
	else if(age<18) {
		throw new InvalidAgeException("Age is not valid to vote");
		
	}
	else {
		System.out.println("welcome to vote");
	}
}
	public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter your age");
	int age=ip.nextInt();
	try {
		validate(age);
	}
	catch(InvalidAgeException e) {
		System.out.println("Invalid Age");
		System.out.println("Exception occurs: "+e);
	}
	System.out.println("Rest of the code....");

	}

}
