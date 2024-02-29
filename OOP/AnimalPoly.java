package OOP;

class AnimalPoly {
public void animalSound() {
	System.out.println("The animal makes a sound");
}
}
class Pig extends AnimalPoly{
	public void animalSound() {
		System.out.println("The pig says: gwee gwee");
	}
}
class Dog extends AnimalPoly{
	public void animalSound() {
		System.out.println("The dog says: woh woh");
	}
}