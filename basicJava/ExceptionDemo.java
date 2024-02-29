package basicJava;

public class ExceptionDemo {

	public static void main(String[] args) {
		int num=50;
		int result=0;
		try{result=num/0;}
		catch(ArithmeticException e) {
			System.err.println("Something went wrong!");
		}
		System.out.println("Result is "+result);
		System.out.println("Thank you for your attention");
	}

}
