package OOP;

public class AnimalMainPoly {

	public static void main(String[] args) {
		AnimalPoly myAnimal=new AnimalPoly();
		AnimalPoly myPig=new Pig();
		AnimalPoly myDog=new Dog();
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();

	}

}
