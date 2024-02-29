package OOP;

public class MyClass {
int x;
	public MyClass() {
		
	}

	public static void main(String[] args) {
		int x=0;
	MyClass obj=new MyClass();
	System.out.println("Before x="+obj.x);
	System.out.println(x);
	//obj.x=30;
	System.out.println("After modifying x="+obj.x);
	
	}

}
