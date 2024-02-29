package OOP;

public class StaticDemo {
static int count=0;
private int x=0;
static void increment() {
	count++;
}
void inc_x() {
	this.x++;
}
	public static void main(String[] args) {
		increment();
		increment();		
		StaticDemo obj1=new StaticDemo();
		StaticDemo obj2=new StaticDemo();
		StaticDemo obj3=new StaticDemo();
		obj1.inc_x();
		obj1.inc_x();
		obj2.inc_x();
		obj3.inc_x();

		obj1.increment();
		obj2.increment();
		obj3.increment();
		StaticDemo.increment();
		System.out.println("Obj one count="+obj1.count+" and obj one x= "+obj1.x);
		System.out.println("Obj two count="+obj2.count+" and obj two x= "+obj2.x);
		System.out.println("Obj three count="+obj3.count+" and obj three x= "+obj3.x);
		System.out.println(count);
		System.out.println(StaticDemo.count);

	}

}
