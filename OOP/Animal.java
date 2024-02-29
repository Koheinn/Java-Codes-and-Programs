package OOP;

public class Animal {
public void makeSound() {
	System.out.println("Blah Blah....");
}

}
class Cat extends Animal{
	@Override
	public void makeSound() {
		
		//super.makeSound();
		System.out.println("Mow Mow....");
	}
}

