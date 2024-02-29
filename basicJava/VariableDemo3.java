package basicJava;

public class VariableDemo3 {
int num1;
public static void main(String[] args) {
	char space=32;
	String st="Hello From Java Programming";
	String st1=new String(",Happy Learning)");
	System.out.println(st.charAt(0));
	System.out.println(st.indexOf("Java"));
	int num1=2,num2=2;
	if (num1==num2)
		System.out.println("Same");
	else
		System.out.println("Not Same");
	if (st1.equals(st))
		System.out.println("Same");
	else
		System.out.println("Not Same");
}
}
