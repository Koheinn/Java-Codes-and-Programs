package basicJava;

import java.util.Scanner;

public class Testing {
static String name;
static String moduleName;
static int moduleMarks;
static Scanner ip;
static String status=null;
	public static void main(String[] args) {
	 ip=new Scanner(System.in);
//		 for(int i=0;i<3;i++) {
//			 getInfo();
//			 status=getStatus();
//		     display(); 
//		     System.out.println();
//		 }
	    System.out.println("Enter a alphabetic");
		char ch=ip.next().toLowerCase().charAt(0);
		String vowels="aeiou";
//		if(vowels.contains(ch+"")) {
//			System.out.println("Vowel");
//		}
//		else {
//			System.out.println("Consonant");
//		}
		switch(ch) {
		case 'a':System.out.println("Vowel");break;
		case 'e':System.out.println("Vowel");break;
		case 'i':System.out.println("Vowel");break;
		case 'o':System.out.println("Vowel");break;
		case 'u':System.out.println("Vowel");break;
		default:System.out.println("Consonant");
		}
	}
	static private void getInfo() {
		System.out.println("Enter Student Name: ");
		name=ip.next();
		System.out.println("Enter Module Name ");
		 moduleName=ip.next();
		System.out.println("Enter Module Marks ");
		moduleMarks=ip.nextInt();
	}
	static private String getStatus() {
		if(moduleMarks>=70 && moduleMarks<=100) {
			status="Pass with distinctionn";
		}
		else if(moduleMarks>=60 && moduleMarks<=69) {
			status="Merit";
		}
		else if(moduleMarks>=40 && moduleMarks<=59) {
			status="Pass";
		}
		else if(moduleMarks>=0 && moduleMarks<40)
		{
			status="Fail";
		}
		else {
			status="Invalid Input";
		}
		return status;
		
	}
	static private void display() {
		System.out.printf("%s\t%s\t%s\n","Name","Module Name","Status");
		System.out.printf("%s\t%s\t\t%s",name,moduleName,status);
	}

}


