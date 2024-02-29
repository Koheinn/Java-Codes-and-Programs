package OOP;

class Other {

	public static void main(String[] args) {
		StaticDemo.increment();
		StaticDemo obj=new StaticDemo();
		obj.increment();
		StaticDemo.increment();
		System.out.println(StaticDemo.count);
		System.out.println(obj.count);
	
		

	}

}
