package basicJava;

import java.util.Scanner;

public class TestInvalidNameDemo {

	static void validate(String name) throws InvalidNameException {
		if(name.length()<2 || name.length()>50) {
			throw new InvalidNameException("Name is invlid length of characters");
		}
		else if(!Character.isLetter(name.charAt(0))) {
			throw new InvalidNameException("Name must start with letters");
		}
		else {
			System.out.println("valid name");
		}
	}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=ip.nextLine();
		try {
			validate(name);
		}catch(InvalidNameException e) {
			e.printStackTrace();
			System.err.println("Invalid name");
		}
		System.out.println("Rest of the code....");

	}

}
