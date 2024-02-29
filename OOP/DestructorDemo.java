package OOP;

public class DestructorDemo {

	public DestructorDemo() {
		
	}

	public static void main(String[] args) throws Throwable{
		DestructorDemo obj=new DestructorDemo();
	
			obj.finalize();
		
		obj=null;
		System.gc();
		//obj.toString();
		System.out.println("The End of Main method");

	}
	protected void finalize() throws Throwable{
		System.out.println("Output in method finalize");
	}

}
