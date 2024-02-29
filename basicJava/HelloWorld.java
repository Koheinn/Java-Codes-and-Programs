package basicJava;

import java.util.Scanner;

//developed by ThiriMon
//control statements
public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
//		System.out.println("Enter your email:");
//       String email=ip.next();
//       if(email==null || email.isEmpty()) {
//    	   System.out.println("Email must not be empty");
//       }else
//       {
//    	   if(email.contains("@") && email.contains(".")&& Character.isLetter(email.charAt(0)))
//    	   {
//    		   System.out.println("Valid Email");
//    	   }
//    	   else {
//    		   System.out.println("Invalid Email");
//    	   }
//       }
//System.out.println("Enter your age");
//int age=ip.nextInt();
//if(age>=1 && age<10) {
//	System.out.println("Child");
//}
//else if(age>=10 && age<=17) {
//	System.out.println("Teenager");
//}
//else if(age>=18 && age<=100) {
//	System.out.println("Adult");
//}
//else {
//	System.out.println("Invalid Age input!");  
//}
//
//		System.out.println("Enter a number");
//		int x=ip.nextInt();
//		boolean isEven=(x%2==0)?true:false;
//		System.out.println((isEven)?"Number is even":"Number is odd");
//System.out.println("Enter day number");
//int day=ip.nextInt();
//switch(day) {
//case 1:System.out.println("Sunday");break;
//case 2:System.out.println("Monday");break;
//case 3:System.out.println("Tuesday");break;
//case 4:System.out.println("Wednesday");break;
//case 5:System.out.println("Thursday");break;
//case 6:System.out.println("Friday");break;
//case 7:System.out.println("Saturday");break;
//default:System.out.println("Enter a valid day number");
//}
//switch(day) {
//
//case 2:
//case 3:
//case 4:
//case 5:
//case 6:System.out.println("week days");break;
//case 1:
//case 7:System.out.println("weekends");break;
//default:System.out.println("Enter a valid day number");
//
//}
//char ch='A';
//System.out.println((int)ch);
		System.out.println("ASCII VALUE\tCharacter");
		for(int i=0;i<=255;i++) {
			System.out.printf("     %d\t\t %s\n",i,(char)i);
		}
}

}


