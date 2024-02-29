package OOP;

public class CarTwo extends Vehicle{
	  private String modelName = "Mustang";    
	  @Override
	public void drive() {
		
		super.drive();
		System.out.println("Repairing the car.....");
	}
	public static void main(String[] args) {
		CarTwo obj=new CarTwo();
		System.out.println(obj.modelName);
		obj.honk();
		System.out.println(obj.getBrand());
		obj.drive();

	}

}
