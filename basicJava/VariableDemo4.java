package basicJava;

import java.util.Scanner;

public class VariableDemo4 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter statement");
	String ip=input.nextLine();
	char arr[]=ip.toCharArray();
	int opIndex=0;
	for (int i=0;i<arr.length;i++) {
		if(!Character.isDigit(arr[i])){
			opIndex=i;
		}
	}
	int op1=Integer.parseInt(ip.substring(0,opIndex));
	char opeartor=ip.charAt(opIndex);
	int op2=Integer.parseInt(ip.substring(opIndex));
	System.out.println(op1);
	System.out.println(opeartor);
	System.out.println(op2);
}
}
