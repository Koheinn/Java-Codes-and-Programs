package basicJava;

import java.util.Scanner;

public class LoopintSDT {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		char inputChar = 'a';
	
		while(inputChar!='q') {
			System.out.println("Give me a letter:");
			inputChar=ip.next().toLowerCase().charAt(0);
		}
		System.out.println("Bye Bye!");
		
		

	}

}
