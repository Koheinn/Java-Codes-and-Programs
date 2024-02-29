package basicJava;
 
import java.util.Scanner;
 
public class VariableDemo5 {
 
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter statement:");
	String ip=input.nextLine();
	String opst="+-*/%";
	char arr[]=ip.toCharArray();
	int opIndex=0;
	for(int i=0;i<arr.length;i++) {
		if(!Character.isDigit(arr[i])&&opst.contains(""+arr[i])){
			opIndex=i;
		}
	}
	//System.out.println(opIndex);
	double op1=Double.parseDouble(ip.substring(0, opIndex));
	char operator=ip.charAt(opIndex);
	double op2=Double.parseDouble(ip.substring(opIndex+1));
//	System.out.println(op1);
//	System.out.println(operator);
//	System.out.println(ip.substring(opIndex+1));
	if(operator=='+') {
		System.out.printf("%f%s%f=%.2f",op1,operator,op2,(op1+op2));
	}
	else if(operator=='-') {
		System.out.printf("%f%s%f=%.2f",op1,operator,op2,(op1-op2));
	}
	else if(operator=='*') {
		System.out.printf("%f%s%f=%.2f",op1,operator,op2,(op1*op2));
	}
	else if(operator=='/') {
		System.out.printf("%f%s%f=%.2f",op1,operator,op2,(double)(op1/op2));	
		
	}
	else if(operator=='%') {
		System.out.printf("%f%s%f=%.2f",op1,operator,op2,(op1%op2));	
		
	}
	   
	}
	
}
